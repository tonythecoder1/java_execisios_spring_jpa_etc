package colecoes;

import java.util.HashSet;

public class colecoes_ex {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Ola");
		conjunto.add(1);
		
		System.out.println("Conjunto" + conjunto + " Tamanho: " + conjunto.size() + " elementos");
		
	}

}
