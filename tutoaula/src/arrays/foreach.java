package arrays;

public class foreach {

	public static void main(String[] args) {
		
		double notas_a[] = {10.2, 19.7, 15.8};
		int i = 1;
		
		for(double nota: notas_a) {
			
			System.out.println(i + " - " + nota);
			i++;
		}
		
		

		for(int cont = 0; cont <= notas_a.length; cont++) {
			
			System.out.println(notas_a[cont]);
			if(cont == notas_a.length) { break; }
			
		}
		
		
		
	}
	
}
