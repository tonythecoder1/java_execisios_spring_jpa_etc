package generics;

public class caixa {
	
	private Object coisa;
	
	public void aguardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir_caixa() {
		return coisa;		
	}

}
