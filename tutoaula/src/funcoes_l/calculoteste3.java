package funcoes_l;

import java.util.function.BinaryOperator;

public class calculoteste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> soma_func = (x, y) -> { return x+y; };
		
		System.out.println(soma_func.apply(2.0,3.0));
		
		soma_func = (x, y) -> x*y;
		
		System.out.println(soma_func.apply(8.0,7.0));
		 
		
	}

}
