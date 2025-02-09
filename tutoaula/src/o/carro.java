package o;

public class carro {
	
	motor engi;
	
	public carro() {
		
		engi = new motor(this);
		
	}
	
	void acelerar() { engi.fator_injeccao += 0.4;}
	
	void travar() { engi.fator_injeccao -= 0.4;}
	
	void start() { engi.ligado = true;}
	
	void stop(){ engi.ligado = false; }

	boolean estaligado() {return engi.ligado;}
	
	
}
