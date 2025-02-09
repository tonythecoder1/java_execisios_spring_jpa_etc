package generics;

public class caixa_teste {

	public static void main(String[] args) {
		
		caixa caixa_a = new caixa();
		
		caixa_a.aguardar(2.3);		
		
		Integer coisa = (Integer) caixa_a.abrir_caixa();	
		System.out.println(coisa);
	}
	
}
