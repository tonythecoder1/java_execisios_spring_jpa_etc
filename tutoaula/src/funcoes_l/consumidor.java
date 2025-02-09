package funcoes_l;

import java.lang.classfile.Signature.ArrayTypeSig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumidor {
	
	public static void main(String[] args) {
		
		Consumer<produto> imprimir = valor -> System.out.println(valor.preco);
		
		produto p1 = new produto("PS5", 599.99, 0.05);
		produto p2 = new produto("PC Gamer", 1100.99, 0.05);
		produto p3 = new produto("Nintendo", 299.99, 0.05);
		
		imprimir.accept(p1);
		
		List<produto> lista_produtos = Arrays.asList(p1,p2,p3);
		
		lista_produtos.forEach(imprimir);
		
		lista_produtos.forEach(System.out::println);
		
	}

}
