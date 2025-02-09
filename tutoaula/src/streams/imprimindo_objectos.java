package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindo_objectos {
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Ana", "Bea", "Gui");
		Iterator<String> iter = lista.iterator();
		
		System.out.println("Usando o ITERATOR");
		
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
			
		}
		
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
		
		
	
		
	}

}
