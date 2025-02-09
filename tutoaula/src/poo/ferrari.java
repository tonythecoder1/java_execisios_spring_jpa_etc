package poo;

public class ferrari extends carro implements desportivo, luxo{
	
	boolean ar_ligado, turbo_ligado;
	
	public ferrari() {this(315); }
	
	public ferrari(int velocidade_maxima) {
		
		super(velocidade_maxima);
		delta = 15;
		
	}
	
	@Override
	public void ligar_turbo() {
		
		turbo_ligado = true;
		delta = 35;
		
	}
	
	@Override
	public void desligar_turbo() {
		
		turbo_ligado = false;
		delta = 15;
	}
	
	@Override
	public void ligar_ar() {
		
		ar_ligado = true;
		
	}
	
	@Override
	public void desligar_ar() {
		
		ar_ligado = false;
		
	}
	
	
	@Override
	public int getDelta() {
		
		
		if(turbo_ligado && !ar_ligado) {
			
			return 35;
			
		} else if(turbo_ligado && ar_ligado) {
			
			return 30;
			
		} else if(!turbo_ligado && !ar_ligado){
		
			return 20;
			
		} else {
			
			return 15;
		}
		
		
	
	}
	

	

}
