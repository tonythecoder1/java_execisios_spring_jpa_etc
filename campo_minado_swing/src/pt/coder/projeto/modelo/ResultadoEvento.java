package pt.coder.projeto.modelo;

public class ResultadoEvento {
	
	private final boolean ganhou;
	
	public ResultadoEvento(boolean ganhou) {
		
		this.ganhou = ganhou;
	}
	
	public boolean is_ganhou() {
		
		return ganhou;
	}

}
