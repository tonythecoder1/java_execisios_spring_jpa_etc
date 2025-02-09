package streams;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class criar_streams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "Ruby", "C#");
		
		langs.forEach(print);
		
		String[] maislangs = { "Pearl", "PHP", "Python" };
		
		Stream.of(maislangs).forEach(print);
		Arrays.stream(maislangs).forEach(print);
		Arrays.stream(maislangs, 1, 2).forEach(print);
		
		List<String> nova_lista = new ArrayList<String>();
		
		
		
		List<String> lista_string = Arrays.asList("Oii", "Joao", "Bea", "Gui", "Mapas");
		lista_string.stream().forEach(System.out::println);
		
		lista_string.stream().forEach(nova_lista::add);
		
		System.out.println("Mostrar NOVA LISTA ");
		nova_lista.stream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print);;
		
		
		
		
	}

}
