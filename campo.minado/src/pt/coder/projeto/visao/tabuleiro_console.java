package pt.coder.projeto.visao;

import java.security.Identity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import pt.coder.projeto.excecao.ExplosaoException;
import pt.coder.projeto.excecao.sair_exception;
import pt.coder.projeto.modelo.tabuleiro;

public class tabuleiro_console {
	
	private tabuleiro tabuleiro_geral;
	Scanner entradaScanner = new Scanner(System.in);
	
	public tabuleiro_console(tabuleiro tb1) {
		
		this.tabuleiro_geral = tb1;
		executar_jogo();
		
	}

	private void executar_jogo() {
		
		try {
			boolean continuar = true;
			
			while(continuar) {
				
				ciclo_do_jogo();
				
				System.out.println("Quer continuar a jogar ?");
				String resposta = entradaScanner.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro_geral.reset_jogo();
				}
			}
		} catch (sair_exception e) {
			System.out.println("Saiu do Jogo");
		} finally {
			entradaScanner.close();
		}
		
	}

	private void ciclo_do_jogo() {
		try {
			
			while (!tabuleiro_geral.objectivo_alcancado()) {
				
				
				System.out.println(tabuleiro_geral);
				
				String digitado = capturar_valor_digitado("Insira o valor de x e y ");
				
				 
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					  .map(e -> Integer.parseInt(e.trim())).iterator();
			
				
				digitado = capturar_valor_digitado("1 - Abrir, 2 - Marcar/Desmarcar");
				
				if ("1".equals(digitado)) {
					tabuleiro_geral.abrir(xy.next(), xy.next());
				}else if ("2".equals(digitado)) {
					tabuleiro_geral.marcar(xy.next(), xy.next());
				}
				
			}
			
			System.out.println("Voce ganhou!!!");
		} catch (ExplosaoException e) {
			
			System.out.println("Voce perdeu - Game Over!!!");
			System.out.println(tabuleiro_geral);
			
		}
		
	}
	
	private String capturar_valor_digitado(String texto) {
		
		String digitado = entradaScanner.nextLine();
		System.out.println(texto);
		
		if ("s".equalsIgnoreCase(digitado)) {
			throw new sair_exception();
		}
		
		return digitado;
		
		
	}
		
}

