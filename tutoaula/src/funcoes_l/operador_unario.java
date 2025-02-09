package funcoes_l;

import java.util.function.UnaryOperator;

public class operador_unario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisdois = n -> n + 2;
		UnaryOperator<Integer> vezesdois = n -> n*2;
		
		
		
		System.out.println(maisdois.andThen(vezesdois).apply(2));
		
	}

}
