package streams;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafio_map {
	
	public static void main(String[] args) {
		
		List<Integer> lista_numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> lista_binarios = new ArrayList<Integer>();
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
				
		Function<String, Integer> binario_para_int = 
				s -> Integer.parseInt(s, 2);
		
		
		lista_numeros.stream()
							.map(Integer::toBinaryString)
							.map(inverter)
							.map(binario_para_int)
							.forEach(System.out::println);
		
	
	}

}
