package o;

public class carro_montado {

	public static void main(String[] args) {
		
		carro c1 = new carro();
		
		c1.start();
		System.out.println(c1.estaligado());
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.engi.giros());
		
		
	}
	
}
