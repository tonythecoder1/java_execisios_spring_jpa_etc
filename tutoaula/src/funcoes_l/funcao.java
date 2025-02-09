package funcoes_l;

import java.util.function.Function;

public class funcao {
	
	public static void main(String[] args) {
		Function<Integer, String> par_impar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(par_impar.apply(10));
		
		Function<Integer, Boolean> verifica = numero -> numero + 10 == 11 ? true : false;
		
		System.out.print(verifica.apply(1));
		
		System.out.println();
		
		
		Function<String, String> resultado = valor -> "O resultado e " + valor;
		
		String resultado_final = par_impar.andThen(resultado).apply(33);
		
		System.out.println(resultado_final);
		
 	}

}
