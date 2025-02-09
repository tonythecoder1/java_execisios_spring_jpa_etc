package colecoes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import arrays.foreach;

public class mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> lista_utilizadores = new HashMap<Integer, String>();
		
		lista_utilizadores.put(1,"Joao");
		lista_utilizadores.put(2, "Manuel");
		lista_utilizadores.put(3,"Guilherme");
		
		System.out.println(lista_utilizadores.size());
		System.out.println(lista_utilizadores.isEmpty());
		System.out.println(lista_utilizadores.keySet());
		System.out.println(lista_utilizadores.get(2));
		
		
		for(int chave:lista_utilizadores.keySet()) {
			
			System.out.println(chave);
			
			
		}
		
		
		for (Map.Entry<Integer, String> registro : lista_utilizadores.entrySet()) {
		
		    System.out.print(" " + registro.getValue());
		    
		}

	}

}
