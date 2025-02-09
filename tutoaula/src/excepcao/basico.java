package excepcao;

public class basico {
	
	public static void main(String[] args) {
		
		aluno al1 = null;
		
		try {
			imprimir_aluno(al1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ");
		}
		
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			
		}
		
	}
	
	public static void imprimir_aluno(aluno al) {
		
		System.out.println(al.nome);
		
	}

}
