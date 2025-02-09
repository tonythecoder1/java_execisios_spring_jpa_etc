package funcoes_l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class operador_binario {
	
	
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(media.apply(3.0, 2.0));
		
		BiFunction<Double, Double, String> verifica = (n1, n2) -> {
			
		double notafinal = (n1 + n2);
		return notafinal >= 8 ? "Aprovado" : "Reprovado";
		
	};
	
	Function<Double, String> verifica_final = valor -> valor >= 8 ? "Aprovado" : "Reprovado";
	
	System.out.println(media.andThen(verifica_final).apply(10.5, 15.0));
		
		
		System.out.println(verifica.apply(3.0, 10.5));
	}


}
