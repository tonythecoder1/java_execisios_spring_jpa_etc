package pt.coder.projeto.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class tabuleiro implements CampoObservador {
	
	private int linhas_x;
	private int colunas_y;
	private int minas;
	
	private final List<campo> lista_campos = new ArrayList<campo>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<Consumer<ResultadoEvento>>();
	
	public tabuleiro(int linhas, int colunas, int minas) {
		
		this.linhas_x = linhas;
		this.colunas_y = colunas;
		this.minas = minas;
		
		gerarcampos();
		associarosvizinhos();
		minas_random();
		
	}
	
	public void registrar_observador(Consumer<ResultadoEvento> observador) {
		
		observadores.add(observador);
		
	}
	
	public void notificar_observadores(boolean evento_verifica) {
		observadores.stream()
					.forEach(o -> o.accept(new ResultadoEvento(evento_verifica)));
	}
	
	public void abrir(int linha_abrir, int coluna_abrir) {
		
			lista_campos.stream()
			.filter(c -> c.getLinha_x() == linha_abrir && c.getColuna_y() == coluna_abrir)
			.findFirst()
			.ifPresent(c -> c.abrir());
	}
	
	private void mostrar_minas() {
		lista_campos.stream()
				    .filter(c -> c.is_minado())
				    .filter(c -> !c.ismarcado())
				    .forEach(c -> c.set_aberto(true));
	}
	
	public void marcar(int linha_marcada, int coluna_marcada) {

			lista_campos.stream()
			.filter(c -> c.getLinha_x() == linha_marcada && c.getColuna_y() == coluna_marcada)
			.findFirst()
			.ifPresent(c -> c.mudar_marcacao());
	}

	private void minas_random() {
		
		long minas_armadas = 0;
		
		do {
			Predicate<campo> minado_p = m -> m.is_minado();
			
			minas_armadas = lista_campos.stream().filter(minado_p).count();
			int aleatorio = (int) (Math.random() * lista_campos.size());
			
			lista_campos.get(aleatorio).minar_campo();
			
		} while (minas_armadas < minas);
		
	}

	private void associarosvizinhos() {
		
		for(campo c1 : lista_campos) {
			for(campo c2 : lista_campos) {
				c1.adicionar_vizinho(c2);
			}
			
		}
		
	}

	private void gerarcampos() {
		
		for(int l = 0; l < linhas_x; l++) {
			for(int c = 0; c < colunas_y; c++) {
				
				campo ccCampo = new campo(l, c);
				ccCampo.registrar_observadores(this);
				lista_campos.add(ccCampo);
				
				
			}
			
		}
		
		
	}
	
	public boolean objectivo_alcancado() {
		
		return lista_campos.stream().allMatch(c -> c.objectivo_alcancado());
	}
	
	
	public void reset_jogo() {
		lista_campos.stream().forEach(c -> c.jogo_reset());
		minas_random();
		
	}
	
	@Override
	public void EventoOcorreu(campo c, CampoEvento evento) {
		if (evento == CampoEvento.Explodir) {
			notificar_observadores(false);
			mostrar_minas();
		} else if (objectivo_alcancado()) {
			notificar_observadores(true);
		}
		
	}

	public int getLinhas_x() {
		return linhas_x;
	}

	public void setLinhas_x(int linhas_x) {
		this.linhas_x = linhas_x;
	}

	public int getColunas_y() {
		return colunas_y;
	}

	public void setColunas_y(int colunas_y) {
		this.colunas_y = colunas_y;
	}
	
	public void ParaCadaElemento(Consumer<campo> funcao) {
		lista_campos.forEach(funcao);
	}
	
	
	
}