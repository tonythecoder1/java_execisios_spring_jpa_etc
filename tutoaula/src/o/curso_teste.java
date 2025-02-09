package o;

import java.awt.Cursor;
import java.util.Iterator;
import java.util.Scanner;

public class curso_teste {
	
	public static void main(String[] args) {
		
		String nome_aluno_atual, curso_procurado;
		curso curso_encontrado = new curso();
		
		
		aluno aluno_gestor = new aluno();
		
		Scanner entrada = new Scanner(System.in);
		
		aluno_gestor.add_aluno("Joao");
		aluno_gestor.add_aluno("Rita");
		aluno_gestor.add_aluno("Joana");
		aluno_gestor.add_aluno("Guilherme");
		
		aluno aluno2 = new aluno("Pedro");
		aluno aluno3 = new aluno("Gama");
		
		curso curso1 = new curso("Java");
		curso curso2 = new curso("C#");
		curso curso3 = new curso("Python");
		
		
		curso1.add_aluno(aluno2);
		curso1.add_aluno(aluno3);
		
		aluno2.add_curso(curso2);
		
		
		nome_aluno_atual = aluno2.nome;
		System.out.println("Aluno: " + nome_aluno_atual);
		System.out.println("Qual curso deseja verificar em que o aluno se encontra inscrito ? ");
		curso_procurado = entrada.nextLine();
		
		if(aluno2.devolve_curso_procurado(curso_procurado)!=null) {
			
			curso_encontrado = aluno2.devolve_curso_procurado(curso_procurado);
			System.out.println("O aluno encontrasse inscrito no curso inserido - CURSO " + curso_encontrado.nome);
			
		} else { 
			
			System.out.println("O aluno " + nome_aluno_atual + " nao se encontra inscrito no curso de " + curso_procurado);
		}
		
		
		System.out.println("");
		
		int i = 0;
		System.out.println("Alunos inscritos no curso de " + curso1.nome);
		for(aluno x: curso1.lista_alunos) {
			
			i++;
			System.out.println("Aluno - " + i + " - Nome: " + x.nome);
			
		}
		
		i = 0;
		
		System.out.println("Cursos em que o aluno " + aluno2.nome + " esta inscrito");
		for(curso c: aluno2.lista_cursos) {
			
			i++;
			System.out.println("Curso " + i + " - Nome do curso: " + c.nome);
			
		}
		
		
		
		
		
	}

}
