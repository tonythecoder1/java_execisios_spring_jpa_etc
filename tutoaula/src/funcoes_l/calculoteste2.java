package funcoes_l;

public class calculoteste2 {
	
	public static void main(String[] args) {
		
		calculo soma_func = (x, y) -> { return x+y; };
		
		System.out.println(soma_func.executar(1,2));
		
		soma_func = (x, y) -> x*y;
		
		System.out.println(soma_func.executar(10,10));
		 
		
	}

}
