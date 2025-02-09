package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import colecoes.lista;

public class reduce2 {
	
	
	public static void main(String[] args) {
		
		aluno a1 = new aluno("Ana", 10.5);
		aluno a2 = new aluno("Gui", 15.5);
		aluno a3 = new aluno("Joao", 9.5);
		aluno a4 = new aluno("Bea", 14.5);
		
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		Predicate<aluno> aprovado = a -> a.nota >= 10;
		BinaryOperator<Double> soma = (a, b) -> a + b;
		
		lista_alunos.stream()
				.filter(aprovado)
				.map(a -> a.nota)
				.reduce(soma)
				.ifPresent(System.out::println);
				
		
		
	}
	
	
	
	
	
	

}
