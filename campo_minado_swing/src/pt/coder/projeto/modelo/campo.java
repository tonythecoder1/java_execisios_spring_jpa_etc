package pt.coder.projeto.modelo;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;


public class campo {
	
	private final int linha_x;
	private final int coluna_y;
	
	private boolean aberto;
	private boolean minado;
	public boolean marcado;
	
	private List<campo> lista_vizinhos = new ArrayList<campo>();
	private List<CampoObservador> lista_observers = new ArrayList<CampoObservador>();
	

	public campo(int coluna_y, int linha_x) {
		this.coluna_y = coluna_y;
		this.linha_x = linha_x;
	}
	
	public void registrar_observadores(CampoObservador observador) {
		lista_observers.add(observador);
	}
	
	private void notificar_observador(CampoEvento evento) {
		
		lista_observers.stream().forEach(o -> o.EventoOcorreu(this, evento));
		
	}
	
	public boolean adicionar_vizinho(campo vizinho) {
		
		boolean linha_diferente = linha_x != vizinho.linha_x;
		boolean coluna_diferente = coluna_y != vizinho.coluna_y;
		boolean diagonal = linha_diferente && coluna_diferente;
		
		int delta_linha_x = Math.abs(linha_x - vizinho.linha_x);
		int delta_coluna_y = Math.abs(coluna_y - vizinho.coluna_y);
		int delta_geral = delta_linha_x + delta_coluna_y;
		
		if(delta_geral == 1 && !diagonal) {
			
			lista_vizinhos.add(vizinho);
			return true;
			
		} else if (delta_geral == 2 && diagonal) {
			
			lista_vizinhos.add(vizinho);
			return true;
			
		}
		
		return false;
		
	}
	
	
	public void mudar_marcacao() {
		if (!aberto) {
			marcado = !marcado;
			
			if (marcado) {
				notificar_observador(CampoEvento.Marcar);
			} else {
				notificar_observador(CampoEvento.Desmarcar);
			}
		}
	}
	
	
	public boolean abrir() {
	    if (!aberto && !marcado) { // Só abre se não estiver aberto e não estiver marcado
	        if (minado) { // Se o campo estiver minado
	            notificar_observador(CampoEvento.Explodir); // Notifica explosão
	            return true; // Retorna que foi "aberto"
	        }

	        set_aberto(true); // Define o campo como aberto

	        if (vizinhanca_segura()) { // Se a vizinhança for segura
	            lista_vizinhos.forEach(v -> v.abrir()); // Abre todos os vizinhos
	        }

	        return true; // O campo foi aberto com sucesso
	    } else {
	        return false; // Não pode abrir (já está aberto ou marcado)
	    }
	}
	
	boolean vizinhanca_segura() {
	    return lista_vizinhos.stream().allMatch(v -> !v.minado);
	}
	
	public boolean ismarcado() {
		return marcado;
	}
	
	public void minar_campo() {
			minado = true;
	}
	
	public boolean is_minado() {
		return minado;
	}
	
	public boolean is_aberto() {
		return aberto;
	}
	
	public void set_aberto(boolean aberto) {
	    this.aberto = true; // Ignora o valor passado e define o campo como aberto
	    if (aberto) {
	        notificar_observador(CampoEvento.Abrir); // Notifica apenas se o parâmetro 'aberto' for true
	    }
	}

	public int getLinha_x() {
		return linha_x;
	}

	public int getColuna_y() {
		return coluna_y;
	}
	
	public boolean objectivo_alcancado() {
		
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		
		return desvendado || protegido;
	}
	
	public int minas_nos_vizinhos() {
		
		return (int) lista_vizinhos.stream().filter(v -> v.minado).count();
		
	}
	
	public void jogo_reset() {
		
		minado = false;
		aberto = false;
		marcado = false;
		notificar_observador(CampoEvento.Reiniciar);
		
	}
	

	
	
	
	
}
