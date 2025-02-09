package funcoes_l;

import java.util.ArrayList;
import java.util.List;

public class foreach {
	
	public static void main(String[] args) {
		
		List<String> lista_strings = new ArrayList<String>();
		
		lista_strings.add("Jon");
		lista_strings.add("Ana");
		lista_strings.add("Jes");
		lista_strings.add("Bia");
		
		for(String s : lista_strings) {
			
			System.out.println(s);
			
		}
		
		lista_strings.forEach((nome) -> {System.out.println(nome); });
		
		lista_strings.forEach(System.out::println);
		
		lista_strings.forEach((nome) -> imprimir(nome));
		
		lista_strings.forEach(foreach::imprimir);
		
	}
	
	static void imprimir(String nome) {
		
		System.out.println("Oiii o meu nome e: " + nome);
		
	}
	

}

