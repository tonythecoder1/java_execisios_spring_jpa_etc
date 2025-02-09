package pt.coder.projeto.modelo;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		
		tabuleiro tabuleiro_main = new tabuleiro(16, 30, 50);
		PainelTabuleiro painel_main = new PainelTabuleiro(tabuleiro_main);
		add(painel_main);
		
		setTitle("MineSweaper");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
	}

	

}
