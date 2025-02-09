package excepcao.personalizada.b;

import java.util.Objects;

public class aluno {
	
	public String nome;
	public double nota;
	public boolean bom_comportamento;
	
	
	
	public aluno(String nome, double nota) {
		
		this(nome, nota, true);
		
	}
	
	
	public aluno(String nome, double nota, boolean bom_comportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bom_comportamento = bom_comportamento;
	}
	
	public String toString() {
		
		return nome + " tem nota " + nota;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(bom_comportamento, nome, nota);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		aluno other = (aluno) obj;
		return bom_comportamento == other.bom_comportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
	
	
	

}
