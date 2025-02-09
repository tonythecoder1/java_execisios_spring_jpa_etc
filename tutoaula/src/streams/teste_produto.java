package streams;

import java.util.Arrays;
import java.util.List;

public class teste_produto {
	
	public static void main(String[] args) {
		
		produto p1 = new produto("RTX 4090", 1090.79, 0);
		produto p2 = new produto("TV 4K", 1080.79, 0);
		produto p3 = new produto("Torradeira", 80.79, 5.0);
		produto p4 = new produto("Comando PS5", 69.79, 0);
		
		List<produto> lista_produtos = Arrays.asList(p1, p2, p3, p4);
		
		lista_produtos.stream()
					.filter(p -> p.preco < 500)
					.filter(p -> p.envio == 0)
					.map(p -> "Produto: " + p.nome_produto + " Preco: " + p.preco + " Envio Gratis!!! Super Promoçao!!!")
					.forEach(System.out::println);
		
		
	}

}
