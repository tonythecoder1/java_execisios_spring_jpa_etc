package generics;

public class caixa_generic<TIPO> {
	
	private TIPO coisa;
	
	public void aguardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir_caixa() {
		return coisa;		
	}

}