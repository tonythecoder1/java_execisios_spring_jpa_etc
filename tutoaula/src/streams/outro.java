package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class outro {
	
	public static void main(String[] args) {
		
		aluno a1 = new aluno("Ana", 10.5);
		aluno a2 = new aluno("Gui", 15.5);
		aluno a3 = new aluno("Joao", 9.5);
		aluno a4 = new aluno("Bea", 14.5);
		aluno a5 = new aluno("Ana", 10.5);
		aluno a6 = new aluno("Gui", 15.5);
		aluno a7 = new aluno("Joao", 9.5);
		aluno a8 = new aluno("Bea", 14.5);
		
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		media m11Media = new media();
		
		Predicate<aluno> aprovado = a -> a.nota >= 10;
		
		lista_alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Implementar limites e skips: ");
		
		lista_alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		
		
	}

}
