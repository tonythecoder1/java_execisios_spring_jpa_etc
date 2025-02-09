package o;

import java.security.cert.X509Certificate;
import java.util.ArrayList;

import arrays.foreach;

public class compra_teste {

	public static void main(String[] args) {
		compra c1 = new compra();
		
		String nome_item_;
		int quantidade, total;
		double preco_;
		
		ArrayList<item> lista_compras;
		
		c1.nome_cliente = "Joao";
		
		c1.lista_compras_items.add(new item("PS5 PRO", 1, 799.99));
		c1.lista_compras_items.add(new item("PS5", 2, 599.99));
		c1.lista_compras_items.add(new item("Nintendo Switch - Oled", 1, 359.99));
		
		nome_item_= "HP Gamer - OLED 120HZ";
		quantidade = 1;
		preco_ = 999.99;
		
		c1.add_compra(new item(nome_item_, quantidade, preco_));
		
		lista_compras = c1.devolve_lista_compras();
		
		for(item x: lista_compras) {
			
			total = 0;
			
			System.out.println("Fatura");
			System.out.println("Artigo: " + x.devolve_nome_artigo());
			System.out.print("Preço: " + x.devolve_preco_artigo());
			System.out.println("Quantidade: " + x.devolve_quantidade_artigo());
			
			
		}
		
		
		System.out.print(c1.obter_valor_total());
		
	}
}
