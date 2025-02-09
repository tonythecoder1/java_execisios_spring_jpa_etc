package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> lista_numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total = lista_numeros.stream().reduce(soma).get();
		System.out.println(total);
		
		int total2 = lista_numeros.stream().reduce(100, soma);
		System.out.println(total2);
		
		lista_numeros.stream()
				.filter(n -> n > 5)
				.reduce(soma)
				.ifPresent(System.out::println);
	}

}
