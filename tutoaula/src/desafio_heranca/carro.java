package desafio_heranca;

import java.util.ArrayList;
import java.util.List;

public class carro {
	
	
	String modelo;
	int velocidade_atual;
	
	List<carro> lista_carros = new ArrayList<carro>();
	
	public carro()  { this(""); }
	
	public carro(String modelo_) {
		
		modelo = modelo_;
	}
	
	
	
	public void acelera(carro car) {
		
		velocidade_atual = velocidade_atual + 20;
		
	}
	
	public boolean travar(carro car1) {
		
		
		if (car1.velocidade_atual > 0 || car1.velocidade_atual - 10 >= 0) {
			
			car1.velocidade_atual = car1.velocidade_atual - 10;
			return true;
			
		} else {
			
			return false;
		}
	
	}
	
	public boolean paragem_emergencia(carro car12) {
		
		if (car12.velocidade_atual > 0 || car12.velocidade_atual - 10 >= 0) {
			
			car12.velocidade_atual =  0;
			
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	
	
	public String devolve_modelo() {return modelo;}
	
	
	
	

}
