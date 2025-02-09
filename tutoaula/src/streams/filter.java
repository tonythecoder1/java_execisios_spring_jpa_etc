package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class filter {
	
	public static void main(String[] args) {
		
		
		aluno a1 = new aluno("Joao", 10.5, false);
		aluno a2 = new aluno("Gui", 12.5, true);
		aluno a3 = new aluno("Bea", 9.5, true);
		aluno a4 = new aluno("Pedro", 8.5, false);
		
		UnaryOperator<String> operacao = 
				s -> new StringBuilder(s).reverse().toString();
				
		UnaryOperator<String> op2 = 
				s -> new StringBuilder(s).toString().concat(" !!!!");
				
		Predicate<aluno> verifica_nota = a -> a.nota >= 7;
		Predicate<aluno> verifica_comportamento = a -> a.bom_comportamento == true;
		
		
		Function<aluno, String> saudacaoFunction = a -> "OK " + a.nome;
		
		
	
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4);
		
		lista_alunos.stream()
						.filter(a -> a.nota >= 7 )		
						.filter(verifica_comportamento)
						.map(a -> "Parabens " + a.nome + " Voce esta aprovado, a sua nota foi de " + a.nota)
						.forEach(System.out::println);
		
		
		lista_alunos.stream()
						.filter(a -> a.nota > 12)
						.map(a -> "PARABENS FOSTE O MELHOR DA TURMA!!!! " + a.nome )
						.map(op2)
						.forEach(System.out::println);
		
	}

}
