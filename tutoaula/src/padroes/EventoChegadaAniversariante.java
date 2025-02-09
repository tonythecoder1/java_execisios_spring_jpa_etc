package padroes;

import java.sql.Date;

import excepcao.finallyy;

public class EventoChegadaAniversariante {
	
	private final Date momento;
	
	public EventoChegadaAniversariante(Date momento) {
		
		this.momento = momento;
	}
	

	public Date getMomento() {
		return momento;
	}

}
