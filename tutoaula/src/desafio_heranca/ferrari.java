package desafio_heranca;

public class ferrari extends carro {
	
	public ferrari(String modelo_f) {
		
		super(modelo_f);
	}
	
	
	public boolean travagem_ceramica(carro ferrari_carro) {
		
		boolean travage_normal = super.travar(ferrari_carro);
		boolean travagem_normal2 = super.travar(ferrari_carro);
		
		return travage_normal || travagem_normal2;
		
		
	}
	
	
	
	

	
	
	

}
