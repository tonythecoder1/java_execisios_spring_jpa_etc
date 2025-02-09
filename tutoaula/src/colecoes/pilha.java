package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
	
	public static void main(String[] args) {
		Deque<String> lista_pilha = new ArrayDeque<String>();
		
		
		
		lista_pilha.add("Joao");
		lista_pilha.push("Joana");
		
		
		System.out.println(lista_pilha);
	}

}
