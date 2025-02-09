package o;

import java.util.ArrayList;
import java.util.List;

public class curso {
	
	String nome;
	List<aluno>lista_alunos = new ArrayList<aluno>();
	
	public curso(){}
	
	public curso(String nome_do_curso) {
		
		nome = nome_do_curso;
		
	}
	
	void add_aluno(aluno al) {
		
		lista_alunos.add(al);
		al.lista_cursos.add(this);
		
	}
	
	
	


	

}
