package o;

import java.util.ArrayList;
import java.util.List;

public class aluno {
	
	 String nome;
	 final List<curso> lista_cursos = new ArrayList<curso>();
	 List<aluno> lista_de_alunos = new ArrayList<aluno>();
	
	
	
	public aluno(String name) {
		
		nome = name;
		
	}	
	
	public aluno() {}
	
	public void add_aluno(String nome_aluno) {
		
		aluno novo_Aluno = new aluno(nome_aluno);
		lista_de_alunos.add(novo_Aluno);
	}
	
	public List<aluno> devolve_lista_alunos(){
		
		return lista_de_alunos;
		
	}
	
	public List<curso> devovlve_cursos_do_aluno(){
		
		return lista_cursos;
	}
	
	
	void add_curso(curso cc) {
		
		lista_cursos.add(cc);
		cc.lista_alunos.add(this);
		
	}
	
	public curso devolve_curso_procurado(String nome_curso) {
		curso curso_encontrado = null;
		
		for(curso x:lista_cursos) {
			
			if(x.nome.equalsIgnoreCase(nome_curso)) {
				
				curso_encontrado = x;
			}
		}
		
		return curso_encontrado;
	}
	
	
	
	

}
