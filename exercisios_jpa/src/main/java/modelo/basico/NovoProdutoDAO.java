package modelo.basico;

public class NovoProdutoDAO {
	
	
	
	public static void main(String[] args) {
		Dao<Produto> dd = new Dao<>(Produto.class);
		
		Produto prod1 = new Produto("Caneta Bic", 17.8);
		Produto prod2 = new Produto("Iphone 15 Pro", 999.90);
		
		
		dd.incluirAtomico(prod2);
		
		
	
		
		
	}
	
	
	
 
}
