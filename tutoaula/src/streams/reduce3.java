package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class reduce3 {
	
	public static void main(String[] args) {
		
		aluno a1 = new aluno("Ana", 10.5);
		aluno a2 = new aluno("Gui", 15.5);
		aluno a3 = new aluno("Joao", 9.5);
		aluno a4 = new aluno("Bea", 14.5);
		
		List<aluno> lista_alunos = Arrays.asList(a1, a2, a3, a4);
		
		media m11Media = new media();
		
		Predicate<aluno> aprovado = a -> a.nota >= 10;
		Function<aluno, Double> devolve_nota = a -> a.nota; 
		
		BiFunction<media, Double, media> calcula_media = 
							(med, notas) -> med.adicionar(notas);
							
		BinaryOperator<media> combinar_media = (m1, m2) -> media.combinar(m1, m2);
		
	media media_final =	lista_alunos.stream()
				.filter(aprovado)
				.map(devolve_nota)
				.reduce(new media(), calcula_media, combinar_media);
		
		System.out.println(media_final.get_valor());
	
		
		
		
	}

}
