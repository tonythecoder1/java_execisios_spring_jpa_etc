package pt.coder.projeto.modelo;

import java.awt.Button;
import java.awt.GridLayout;
import java.security.PublicKey;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.TabExpander;

public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(tabuleiro t1) {
		
		setLayout(new GridLayout(t1.getLinhas_x(), t1.getColunas_y()));
		
		t1.ParaCadaElemento(c -> add(new BotaoCampo(c)));
		
		t1.registrar_observador(e -> {
			
			SwingUtilities.invokeLater(() -> {
				if(e.is_ganhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou");
				}else {
					JOptionPane.showMessageDialog(this, "Perdeu");
				}
			});
			
		});
		
		
		t1.reset_jogo();
		
	}
	

}
