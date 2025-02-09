package UmParaUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assento")
public class Assento {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	public Assento() {}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}
	
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	

	
}
