package modelo.basico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {
	
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercisios_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		Usuario usuario = eManager.find(Usuario.class, 2);
		Scanner entradaScanner = new Scanner(System.in);
		String op;
		
		if (usuario != null) {
			
			System.out.println("Usuario encontrado " + usuario.getNome());
			
			System.out.println("Deseja eliminar o usario ? ");
			op = entradaScanner.next();
			
			if(op.equalsIgnoreCase("s")){
				
				eManager.getTransaction().begin();
				eManager.remove(usuario);
				eManager.getTransaction().commit();
				
			} 
			
		} else {
			
			System.out.println("Usuario nao existe");
		}
		
		
		
		eManager.close();
		eManagerFactory.close();
	}
	

}
