package excepcao;

import java.util.Scanner;

public class finallyy {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Insere um numero: ");
			System.out.println("O resultado e " + 7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println("ERRO");
			System.out.println(e.getMessage());
		} finally {
			entrada.close();
		}
		
		
		
	}

}
