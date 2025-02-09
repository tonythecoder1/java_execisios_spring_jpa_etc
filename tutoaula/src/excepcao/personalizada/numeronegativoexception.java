package excepcao.personalizada;

@SuppressWarnings ("serial")
public class numeronegativoexception extends RuntimeException{
	
	private String nome_do_atributo;
	
	public numeronegativoexception(String nome_do_atributo) {
		
		this.nome_do_atributo = nome_do_atributo;
	}
	
	@Override
	public String getMessage() {
		
		return String.format("O numero do atributo esta negativo", nome_do_atributo);
		
	}

}
