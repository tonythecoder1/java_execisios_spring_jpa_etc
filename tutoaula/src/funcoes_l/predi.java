package funcoes_l;

import java.util.function.Predicate;

public class predi {
	
	public static void main(String[] args) {
		
		Predicate<produto> caro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		produto novo_produto = new produto("Portatil", 799.99, 0.05);
		
		System.out.println(caro.test(novo_produto));
		
	}

}
