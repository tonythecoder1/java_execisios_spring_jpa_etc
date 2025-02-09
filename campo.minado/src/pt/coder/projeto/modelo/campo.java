package pt.coder.projeto.modelo;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

import pt.coder.projeto.excecao.ExplosaoException;

public class campo {
	
	private final int linha_x;
	private final int coluna_y;
	
	private boolean aberto;
	private boolean minado;
	public boolean marcado;
	
	private List<campo> lista_vizinhos = new ArrayList<campo>();
	

	public campo(int coluna_y, int linha_x) {
		this.coluna_y = coluna_y;
		this.linha_x = linha_x;
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
		}
	}
	
	
	public boolean abrir() {
		
		if (!aberto && !marcado) {
			
			aberto = true;
			
			if (minado) {
				throw new ExplosaoException();
			}
			
			if (vizinhanca_segura()) {
				
				lista_vizinhos.forEach(v -> v.abrir());
				
			}
			
			return true;
			
		} else {
			
			return false;
			
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
	
	public void set_aberto() {
		aberto = true;
		
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
	
	public long minas_nos_vizinhos() {
		
		return lista_vizinhos.stream().filter(v -> v.minado).count();
		
	}
	
	public void jogo_reset() {
		
		minado = false;
		aberto = false;
		marcado = false;
		
	}
	
	public String toString() {
		
		if(marcado) {
			return "x";
		} else if(aberto && minado){
			return "*";
		} else if (aberto && minas_nos_vizinhos() > 0) {
			return Long.toString(minas_nos_vizinhos());
		} else if (aberto){
			return " ";
		} else {
			return "?";	
		}
		
	}
	
	
	
	
}
