package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class minmax {
	
	public static void main(String[] args) {
		
		
		aluno a1 = new aluno("Ana", 10.5);
		aluno a2 = new aluno("Gui", 15.5);
		aluno a3 = new aluno("Joao", 9.5);
		aluno a4 = new aluno("Bea", 14.5);
		
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4);
		
		media m11Media = new media();
		
		Predicate<aluno> aprovado = a -> a.nota >= 10;
		
		
		Comparator<aluno> melhor_nota = (aluno1, aluno2) -> {
			
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			
			return 0;
		};
		
		System.out.println(lista_alunos.stream().max(melhor_nota).get());
		System.out.println(lista_alunos.stream().min(melhor_nota).get());
		
	}

}
