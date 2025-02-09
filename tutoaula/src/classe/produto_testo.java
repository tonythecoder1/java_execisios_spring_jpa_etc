package classe;


public class produto_testo {
	
	public static void main(String[] args) {
		
		double preco_final; 
		
		Produto p1 = new Produto("PS5", 570.0, 0.29);
		Produto p2 = new Produto("PS5 PRO", 788.00, 0.10);
		
		
		preco_final = p1.precoComDesconto(p1.desconto);
		
		System.out.println(p1.nome + " Preço: " + p1.preco);
		System.out.println("Desconto de: " + p1.desconto + " Preço final " + preco_final);
		
		
		
	}

}
