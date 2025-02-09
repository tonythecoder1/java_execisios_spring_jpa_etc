package modelo.basico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDao dao_p = new ProdutoDao();
		List<Produto> lista_produtos = dao_p.obter_todos2_total();
		
		lista_produtos.stream().forEach(p -> System.out.println("Nome de produto: " + p.getNome()));
		
		double preco_total = lista_produtos
								.stream()
								.map(p -> p.getPreco())
								.reduce(0.0, (x, y) -> x+y)
								.doubleValue();
		
		String item_comprado = lista_produtos
									.stream()
									.filter(p -> p.getPreco() > 900)
									.map(p -> p.getNome())
									.collect(Collectors.joining(","));
		
		
		System.out.println(item_comprado);
		
		System.out.println("Preco total: dos produtos " + preco_total);
		
		dao_p.fechar_dao();

	
								
								
		
	}

}
