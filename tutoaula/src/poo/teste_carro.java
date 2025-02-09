package poo;

public class teste_carro {
	
	public static void main(String[] args) {
		
		
		ferrari f1 = new ferrari();
		
		f1.ligar_turbo();
		
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		
		
		System.out.println("Velocidade atual: " + f1.devolve_velocidade_atual());
		
		
		
	}
	
	

}
