package funcoes_l;

public class produto {
	
	final String nome;
	final Double preco;
	final Double desconto;
	
	
	public produto(String nome, Double preco, Double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		
		return "Nome: " + nome + "Precço: " + preco + "Desconto: " + desconto;
		
	}
	
	

}
