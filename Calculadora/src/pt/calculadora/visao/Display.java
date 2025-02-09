package pt.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Memoria;
import Logica.MemoriaObserver;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObserver{
	
	private final JLabel label;
	
	public Display() {
		
		Memoria gestor_memoria = Memoria.getInstancia();
		gestor_memoria.add_obeservador(this);
		
		setBackground(new Color(46,49,50));
		label = new JLabel(gestor_memoria.getTexto_atual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		add(label);
	}

	@Override
	public void valorAlterado(String valor_aterado) {
		label.setText(valor_aterado);
	}

}
