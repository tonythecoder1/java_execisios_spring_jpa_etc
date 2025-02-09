package UmParaMuitos;

import java.security.Identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private Double preco;
	
	public ItemPedido() {}
	
	
	public ItemPedido(int quantidade, Pedidos pedidos, Produto produto) {
		super();
		this.setPedidos(pedidos); 
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	@ManyToOne
	private Pedidos pedidos;
	
	@ManyToOne
	private Produto produto;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		if (produto != null && this.preco == null) {
			this.preco = produto.getPreco();
		}
	}
	
	
	
	
	
	

}
