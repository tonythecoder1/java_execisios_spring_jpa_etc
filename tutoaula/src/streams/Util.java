package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Util {
	
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeira_letra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> concatena_exclamacao = n -> n + " !!! ";
	
	public final static Consumer<String> print = System.out::println;
	
	
	// Segunda forma de se fazer:
	
	public String concatena_excla(String n) {
		
		return n + " !!!";
	}

}
