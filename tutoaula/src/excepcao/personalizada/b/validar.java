package excepcao.personalizada.b;

public class validar {
	
	private validar() {}
	
	public static void utilizador(aluno aluno_geral) throws stringvaziaexception, numeronegativoexception {
		
		if (aluno_geral == null) {
			
			throw new IllegalArgumentException("O aluno esta nulo ");
			
		} else if (aluno_geral.nome.isEmpty() || aluno_geral.nome.trim().isEmpty()) {
			
			throw new stringvaziaexception("Nome");
			
		} else if (aluno_geral.nota < 0) {
			
			throw new numeronegativoexception("Nota"); 
			
		}{
			
		}
		
	}

}
