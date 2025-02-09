package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercisios_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		Usuario novo_usuario = new Usuario("Jessica", "j@hotmail.com");
		
		eManager.getTransaction().begin();
		eManager.persist(novo_usuario);
		eManager.getTransaction().commit();
		
		System.out.println("O ID foi gerado: " + novo_usuario.getId());
		
		eManager.close();
		eManagerFactory.close();
		
	}

}
