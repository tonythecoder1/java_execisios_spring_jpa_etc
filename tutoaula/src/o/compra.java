package o;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Set;

public class compra {
	
	
	String nome_cliente;
	ArrayList<item> lista_compras_items = new ArrayList<item>();
	
	public compra() { }
	
	public void add_compra(item ii) { 
		
		lista_compras_items.add(ii);
		ii.ci = this;
	}
	
	
	public double obter_valor_total() {
		
		double total = 0;
		
		for(item i: lista_compras_items) {
			
			total = total + i.quantidade * i.preco;
			
		}
		
		return total;
		
	}
	
	public ArrayList<item> devolve_lista_compras(){ return lista_compras_items; }
	
	
	
	
	
}
