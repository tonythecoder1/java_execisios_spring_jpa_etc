package pt.coder.projeto.excecao;

import pt.coder.projeto.modelo.tabuleiro;
import pt.coder.projeto.visao.tabuleiro_console;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		tabuleiro tabuleiro_main = new tabuleiro(5, 5, 5);
		
		new tabuleiro_console(tabuleiro_main);
		
	}

}
