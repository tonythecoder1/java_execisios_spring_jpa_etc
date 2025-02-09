package funcoes_l;

public class calculo_test {
	
	public static void main(String[] args) {
	
		calculo novo_calculo = new soma();
		
		
		System.out.println(novo_calculo.executar(10, 15));
		
		System.out.println(novo_calculo.legal());
		
		System.out.println(calculo.muitolegal());
		
	
	}

}
