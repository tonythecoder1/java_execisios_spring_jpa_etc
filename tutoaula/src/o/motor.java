package o;

public class motor {
	
	double fator_injeccao = 1;
	boolean ligado = false;
	
	carro cc;
	
	public motor(carro c) {
		cc = c;
	}
	
	int giros() {
	
		if(!ligado) {
			
			return 0;
			
		} else {
		
		return (int) Math.round(fator_injeccao * 300);
		
		}
	}
	

}
