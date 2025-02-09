package pt.coder.projeto.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import pt.coder.projeto.excecao.ExplosaoException;

public class tabuleiro {
	
	private int linhas_x;
	private int colunas_y;
	private int minas;
	
	private final List<campo> lista_campos = new ArrayList<campo>();
	
	public tabuleiro(int linhas, int colunas, int minas) {
		
		this.linhas_x = linhas;
		this.colunas_y = colunas;
		this.minas = minas;
		
		gerarcampos();
		associarosvizinhos();
		minas_random();
		
	}
	
	public void abrir(int linha_abrir, int coluna_abrir) {
		
		try {
			lista_campos.stream()
			.filter(c -> c.getLinha_x() == linha_abrir && c.getColuna_y() == coluna_abrir)
			.findFirst()
			.ifPresent(c -> c.abrir());
		} catch (Exception e) {
			lista_campos.stream().forEach(c->c.set_aberto());
			throw e;
		}
		
		
		
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
				
				lista_campos.add(new campo(l, c));
				
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
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		int i = 0;
		
		for(int l = 0; l < linhas_x; l++) {
			for(int c = 0; c < colunas_y; c++) {
				
				sb.append(" ");
				sb.append(lista_campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
		}
	
	
	
	

}
