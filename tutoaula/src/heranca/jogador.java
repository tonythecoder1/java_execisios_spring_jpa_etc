package heranca;

public class jogador {
	
	int vida = 100;
	int x;
	int y;
	
	public boolean andar(direccao direc) {
		
		switch (direc) {
		case NORTE: 
			y++;
			break;
		case SUL: 
			y--;
			break;
		case LESTE:
			x++;
			break;
		
		}
		
		return true;
		
	}
	
	public int devolve_posicao_x() {
		
		return x;
		
	}
	
	public boolean atacar(jogador oponente) {
		
		int deltax = Math.abs(x-oponente.x);
		int deltay = Math.abs(y-oponente.y);
		
		if (deltax == 0 && deltay == 1) {
			oponente.vida = oponente.vida - 10;
			return true;
			
		} else if(deltax == 1 && deltay == 0) {
			oponente.vida = oponente.vida - 10;
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public boolean verifica_vencedor() {
		
		if(vida == 0) {
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	public int devolve_posicao_y() {
		
		return y;
	}
	
	
	

}
