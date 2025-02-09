package funcoes_l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class forncedor {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Bea", "Gui");
		
		System.out.println(lista.get());
	}

}
