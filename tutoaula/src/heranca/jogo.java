package heranca;

import java.util.Random;

public class jogo {
	
	public static void main(String[] args) {
		
		
		
		slime monstro = new slime();
		heroi hero = new heroi();
		
		boolean verifica_vencedor = true;
		
		
		
		
		monstro.x = 10;
		monstro.y = 5;
		
		hero.x = 10;
		hero.y = 4;
		
		System.out.println("Vida antes do ataque: " + " ");
		System.out.println("Vida do slime: " + monstro.vida + " Vida do heroi: " + hero.vida);
		
		monstro.atacar(hero);
		
		hero.ataque_especial(monstro);
		
		
		verifica_vencedor = monstro.verifica_vencedor();
		
		
		if (monstro.verifica_vencedor() == true && hero.verifica_vencedor() == false) {
			
			System.out.println("Venceste! Monstro, VIDA: " + monstro.vida);
			
		} else if (monstro.verifica_vencedor() == false && hero.verifica_vencedor() == true) {
			
			System.out.println("Venceste! Heroi, VIDA: " + hero.vida);
			
		} else if(monstro.verifica_vencedor() == true && hero.verifica_vencedor() == true){
			
			System.out.print("EMPATE - ");
		}
		
		
		
		System.out.println("Vida do slime: " + monstro.vida + " Vida do heroi: " + hero.vida);
		
		
		
		
	}

}
