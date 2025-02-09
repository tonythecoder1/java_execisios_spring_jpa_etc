package desafio_heranca;import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class radar {
	
	boolean excesso;
	
	public radar() {
		
		
	}
	
	
	public int verifica_execesso_velocidade_valor(carro c1) {
		
		
		if(c1.velocidade_atual < 120 && c1.velocidade_atual <= 130) {
			
			return 100;
			
			
		} else if(c1.velocidade_atual > 130) {
			 
			return 300;
			
			
		} else {
			
			return 0;
			
		}
		
	}
	
	public boolean verifica_excesso(carro c1) {
		
		if (c1.velocidade_atual > 120) {
			
			return true;
			
		} else {
			
			
			return false;
			
		}
		
	}
	
	

}
