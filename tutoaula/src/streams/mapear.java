package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class mapear {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> lista_marcas = Arrays.asList("HP", "MSI", "NVIDIA", "SAMSUNG", "APPLE", "SONY");
		
		// lista_marcas.stream().map(m -> m.toLowerCase()).forEach(System.out::println);;
		
		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		// UnaryOperator<String> primeira_letra = n -> n.charAt(0) + "";
		// UnaryOperator<String> concatena_exclamacao = n -> n + " !!! ";
		
		// System.out.println(primeira_letra.andThen(concatena_exclamacao).apply("Boazona"));	
		
		// O codigo comentado foi inserido na classe UTIL
		
		lista_marcas.stream().map(Util.primeira_letra)
							 .map(Util.concatena_exclamacao)
							 .forEach(Util.print);
								
		
		
		
	}

}
