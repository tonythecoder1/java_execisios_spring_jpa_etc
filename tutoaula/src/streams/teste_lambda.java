package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class teste_lambda {
	
	public static void main(String[] args) {
		
		
		List<String> lista_strings = Arrays.asList("Oii", "Joao", "Bea", "Gui");
		
		List<Double> lista_numeros = Arrays.asList(2.3, 2.5, 3.4, 3.2);
		
		
		UnaryOperator<String> devolve = s -> s + "Nome";
		
		UnaryOperator<Double> devolve_numeros = d -> d + 3;
		
		lista_strings.stream()
			.map(devolve)
			.forEach(System.out::println);
		
		lista_numeros.stream()
				.map(devolve_numeros)
				.forEach(System.out::println);
		
		
	}

}
