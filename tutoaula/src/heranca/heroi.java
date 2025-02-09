package heranca;

public class heroi extends jogador {
	
	public boolean atacar(jogador oponente) {
		
		int deltax = Math.abs(x-oponente.x);
		int deltay = Math.abs(y-oponente.y);
		
		if (deltax == 0 && deltay == 1) {
			oponente.vida = oponente.vida - 20;
			return true;
			
		} else if(deltax == 1 && deltay == 0) {
			oponente.vida = oponente.vida - 200;
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public boolean ataque_especial(jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente); 
		boolean ataque2 = super.atacar(oponente); 
		boolean ataque3 = super.atacar(oponente);
		
		return ataque1 || ataque2;
			
			
		
	}

	
}
