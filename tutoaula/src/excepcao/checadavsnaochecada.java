package excepcao;

import javax.management.RuntimeErrorException;

public class checadavsnaochecada {
	
	public static void main(String[] args) {
		
		
		try {
			gera_erro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gera_erro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim de programa");
		
		
	}
	
	//Nao checada ou nao verificada, o compilador da a esoclha se queremos tratar ou nao o erro, nao necessita de try catch
	
	public static void gera_erro1() {
		
		throw new RuntimeException("Ocorreu um erro bem legal #01");
		
	}
	
	//Checada, tem de ser tratado
	
	public static void gera_erro2() throws Exception{
			throw new Exception("Ocorreu um erro bem legal #02");	
	}
	

}
