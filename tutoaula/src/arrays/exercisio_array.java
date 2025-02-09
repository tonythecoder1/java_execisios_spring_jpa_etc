package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class exercisio_array {
	
	
	public static void main(String[] args) {
		double[] notas_aluno = new double[3];
		
		notas_aluno[0] = 7.9;
		notas_aluno[1] = 10.9;
		notas_aluno[2] = 87.9;
		
		System.out.println(Arrays.toString(notas_aluno));
		System.out.println();
		
		for(int i=0; i <= 2; i++) {
			
			System.out.println(i + 1 + " - Nota: " + notas_aluno[i]);
		}
		
		
	}

}
