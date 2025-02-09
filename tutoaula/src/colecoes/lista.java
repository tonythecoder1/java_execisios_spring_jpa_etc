package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

import arrays.foreach;

public class lista {
	
	public static void main(String[] args) {
		
		ArrayList<utilizador> lista_utilizadores = new ArrayList<utilizador>();
		utilizador gestor_util = new utilizador();
		Scanner entrada = new Scanner(System.in);
		String nome_utilizador, s;
		boolean existe = false;
		
		
		do {
			
			System.out.println("Insira um utilizador: ");
			nome_utilizador = entrada.nextLine();
			lista_utilizadores = gestor_util.devolve_lista();
			
			for(utilizador u:lista_utilizadores) {
				
				if(u.devolve_nome().equalsIgnoreCase(nome_utilizador)) {
					
					existe = true;
					
				} 
				
			}
			
			if(existe) {
				
				System.out.println("O utilizador ja existe");
				
			} else {
				
				gestor_util.add_utilizador(nome_utilizador);
				
			}
		
			
			System.out.println("Se deseja adicionar mais um utilizador, insira S");
			s = entrada.nextLine();
			
		} while (s.equals("s") || s.equals("S"));
		
		
		
		lista_utilizadores = gestor_util.devolve_lista();
		
		for(utilizador u: lista_utilizadores) {
			
			System.out.println("Utilizador: " + u.devolve_nome());
		}
		
		
	}

}
