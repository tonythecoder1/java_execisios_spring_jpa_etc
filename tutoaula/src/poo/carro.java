package poo;

public class carro {
	
    private int velocidadeMaxima;
    
    int delta = 5, velocidade_atual, temperatura;
    
    boolean carro_ligado;
    
    
    public carro(int velocidadeMaxima) {
    
    	this.velocidadeMaxima = velocidadeMaxima;
    	
    }

    public int getVelocidadeMaxima() {
    	
        return velocidadeMaxima;
    }
    
    public int devolve_velocidade_atual() {
    	
    	return velocidade_atual;
    }
    
    
    public void acelerar() {
    	
    	if(velocidade_atual + getDelta() > velocidadeMaxima) {
    	
    	velocidade_atual = velocidadeMaxima;
    	
    	} else {
			
    		velocidade_atual = velocidade_atual + getDelta();
    		
		}
    	
    }
    
    public void travar() {
    	
    	if(velocidade_atual - 10 >= 0) {
    		
    		velocidade_atual = velocidade_atual - 10;
    		
    	} else {
			
    		velocidade_atual = 0;
    		
		}
    }
    
    public void ligar_carro() {
    	
    	if (!carro_ligado) {
    		
    		temperatura = 40;
        	velocidade_atual = 0;
        	carro_ligado = true;
        	
		}
    	
    	
    }

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
    
    
    
    
}


