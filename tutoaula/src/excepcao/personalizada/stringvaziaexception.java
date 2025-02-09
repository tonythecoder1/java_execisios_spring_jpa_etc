package excepcao.personalizada;

@SuppressWarnings ("serial")
public class stringvaziaexception extends RuntimeException{
	
	private String nome_do_atributo;
	
	public stringvaziaexception(String nome_do_atributo) {
		
		this.nome_do_atributo = nome_do_atributo;
	}
	
	@Override
	public String getMessage() {
		
		return String.format("A string esta vazia: ", nome_do_atributo);
		
	}

}
