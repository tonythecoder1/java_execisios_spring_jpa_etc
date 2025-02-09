package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class match {
	
	public static void main(String[] args) {
		
		aluno a1 = new aluno("Ana", 10.5);
		aluno a2 = new aluno("Gui", 15.5);
		aluno a3 = new aluno("Joao", 9.5);
		aluno a4 = new aluno("Bea", 14.5);
		
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4);
		
		media m11Media = new media();
		
		Predicate<aluno> aprovado = a -> a.nota >= 10;
		Predicate<aluno> reporvado = aprovado.negate();
		
	
		System.out.println(lista_alunos.stream().allMatch(aprovado));
		System.out.println(lista_alunos.stream().anyMatch(aprovado));
		
		System.out.println(lista_alunos.stream().anyMatch(reporvado));
		
		
	}

}
