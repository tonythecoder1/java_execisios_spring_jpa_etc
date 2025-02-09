package generics;

public class caixa_teste_2 {
	
	public static void main(String[] args) {
		
		caixa_generic<String> caixa_a = new caixa_generic<String>();
		caixa_a.aguardar("OIII");
		System.out.println(caixa_a.abrir_caixa());
		
		caixa_generic<Double> caixa_b = new caixa_generic<Double>();
		caixa_b.aguardar(123.5);
		System.out.println(caixa_b.abrir_caixa());
	}

}
