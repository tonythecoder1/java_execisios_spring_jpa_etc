package funcoes_l;

import java.util.function.Predicate;

public class predicado_composicao {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDitios = num1 -> num1 >= 100 && num1 <= 999;
		
		System.out.println(isPar.test(20));
		
		System.out.println(isTresDitios.test(999));
		
		System.out.println(isPar.and(isTresDitios).test(200));
	}

}
