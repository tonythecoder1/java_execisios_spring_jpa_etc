package pt.coder.projeto.modelo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.classfile.instruction.SwitchCase;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{
	
	private campo campooCampo;
	
	private final Color bG_PADRAOColor = new Color(184,184,184);
	private final Color bg_MARCADO = new Color(8,174,247);
	private final Color bg_Explodir = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	
	
	
	
	public BotaoCampo(campo ccampo) {
		
		this.campooCampo = ccampo;
	
		ccampo.registrar_observadores(this);
		addMouseListener(this);
		setOpaque(true);
		setBackground(bG_PADRAOColor);
		setBorder(BorderFactory.createBevelBorder(0));
	}
	
	
	@Override
	public void EventoOcorreu(campo c, CampoEvento evento) {
		
		switch (evento) {
			
		case Abrir:
			aplicarEstiloAbrir();
			break;
		case Marcar:
			aplicarEstiloMarcar();
			break;
		case Explodir:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}
		
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
		
	}


	private void aplicarEstiloPadrao() {
		setBackground(bG_PADRAOColor);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
	}


	private void aplicarEstiloExplodir() {
		setBackground(bg_Explodir);
		setForeground(Color.WHITE);
		setText("X");
	}


	private void aplicarEstiloMarcar() {
		setBackground(bg_MARCADO);
		setForeground(Color.BLACK);
		setText("M");
	}


	private void aplicarEstiloAbrir() {
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		if(campooCampo.is_minado()) {
			setBackground(bg_Explodir);
			return;
		}
		
		switch (campooCampo.minas_nos_vizinhos()){
		case 1: 
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
		default:
			setForeground(Color.PINK);
		}
		
		String valor = !campooCampo.vizinhanca_segura() ? campooCampo.minas_nos_vizinhos() + "" : "";
		setText(valor);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		if(e.getButton() == 1) {
			campooCampo.abrir();
		} else {
			campooCampo.mudar_marcacao();
		}
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
