package modelo.basico;


import java.nio.channels.InterruptedByTimeoutException;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "curso_java")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome_produto", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "preco_produto", nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	public Produto(String nome, Double preco) {
		super(); 
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
