package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(400,300);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); //Centraliza a janela
		
		
		
		
		JButton button = new JButton("Clicar");
		janela.add(button);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento Occoreu");
				
			}
		});
		
		janela.setVisible(true);
		
		
	}

}
