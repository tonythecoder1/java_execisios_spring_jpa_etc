package excepcao.personalizada.b;

public class teste_validar {
	
	public static void main(String[] args) {
		
		
		try {
			aluno a1 = new aluno("Ana", -2);
			validar.utilizador(a1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	}

}
