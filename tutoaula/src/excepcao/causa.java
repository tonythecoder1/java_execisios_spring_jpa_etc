package excepcao;

public class causa {
	
	public static void main(String[] args) {
		
		aluno al = new aluno("Bea", 10);
		
		try {
			metodo_a(null);
		} catch (Exception e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		
	}
	
	static void metodo_a(aluno a1) {
		
		try {
			metodo_b(a1);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		
	}
	
	static void metodo_b(aluno a2) {
		
		if (a2 == null) {
			throw new NullPointerException("O aluno esta nulo");
		}
		
		System.out.println("Nao e NULO - Nome: " + a2.nome);
	}
	

}
