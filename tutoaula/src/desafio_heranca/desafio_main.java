package desafio_heranca;

public class desafio_main {
	
	public static void main(String[] args) {
		
		radar r1 = new radar();
		int valor;
		
		boolean excesso_velocidade = false;
		
		carro c1 = new carro("Fiat 500");
		carro c2 = new carro("Mercedes A200");
		
		ferrari f1 = new ferrari("Ferrari California");
		
		
		c1.velocidade_atual = 170;
		c2.velocidade_atual = 120;
		f1.velocidade_atual = 180;
		
		f1.travagem_ceramica(f1);
		c1.travar(c1);
		c2.travar(f1);
		
		excesso_velocidade = r1.verifica_excesso(f1);
		
		if (excesso_velocidade == true) {
			
			valor = r1.verifica_execesso_velocidade_valor(f1);
			
			System.out.println("Ultrapassou os valores de velocidade vai ter de pagar " + valor + " EUR");
			
		} else {
			
			System.out.println("Muito bem, continue a conduzir com precauçao e dentro dos limites de velocidade");
			
		} 
		
		
		
		
		
		
	}

}
