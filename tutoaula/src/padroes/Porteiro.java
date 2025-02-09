package padroes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> lista_observadores = new ArrayList<ObservadorChegadaAniversariante>();
	
	public void registrarobservador(ObservadorChegadaAniversariante o) {
		
		lista_observadores.add(o);
		
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase((valor))) {
			
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date(0));
				
				lista_observadores.stream().forEach(o -> o.chegou(evento));
				
				
			} else {
				
				System.out.println("Alarme Falso");
			}
		}
		
		entrada.close();
		
		
	}
	
	

}
