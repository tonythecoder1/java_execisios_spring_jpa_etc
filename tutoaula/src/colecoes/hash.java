package colecoes;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.HashSet;

public class hash {
	
	public static void main(String[] args) {
		HashSet<utilizador> lista_geral = new HashSet<utilizador>();
		
		lista_geral.add(new utilizador("Joao"));
		lista_geral.add(new utilizador("Manuel"));
		lista_geral.add(new utilizador("Francisco"));
		lista_geral.add(new utilizador("Guilherme"));
		
		boolean resultado = lista_geral.contains(new utilizador("Joao"));
		
		System.out.println(resultado);
	}

}
