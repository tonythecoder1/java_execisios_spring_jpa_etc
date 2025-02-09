package o;

public class item {
	
	String nome;
	int quantidade;
	double preco;
	
	compra ci;
	
	public item(String nome2, int quantidade2, double preco2) {
		
		nome = nome2;
		quantidade = quantidade2;
		preco = preco2;
		
	}
	
	public String devolve_nome_artigo() { return nome; }
	
	public double devolve_preco_artigo() { return preco; }
	
	public int devolve_quantidade_artigo() { return quantidade; }
	
	

	
	
	

}
