package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
 Produto(String nome_g, double preco_g, double desconto_g){
	 
	 nome = nome_g;
	 preco = preco_g;
	 desconto = desconto_g;
	 
 }
 
 Produto(){}
 
 
	
 public double precoComDesconto(double descontoDoGerente) {
	
        return preco - (preco * descontoDoGerente);
}
 
 

}

