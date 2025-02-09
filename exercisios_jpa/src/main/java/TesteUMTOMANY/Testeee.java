package TesteUMTOMANY;

import UmParaMuitos.ItemPedido;
import UmParaMuitos.Pedidos;
import modelo.basico.Dao;
import modelo.basico.Produto;

public class Testeee {
	
	public static void main(String[] args) {
		
		Dao<Object> dao = new Dao<>();
		
		Pedidos novo_pedidoPedidos = new Pedidos();
		Produto produto = new Produto("Iphone", 1269.90);
		ItemPedido novo_itemItemPedido = new ItemPedido(10, novo_pedidoPedidos, produto);
		
		dao.abrirTransacao()
			.incluir(produto)
			.incluir(novo_pedidoPedidos)
			.incluir(novo_itemItemPedido)
			.fecharTransacao()
			.fechar_dao();
		
		
		
		
	}

}
