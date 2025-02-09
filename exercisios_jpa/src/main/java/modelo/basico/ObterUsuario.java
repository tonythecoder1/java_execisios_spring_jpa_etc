package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercisios_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		Usuario usuario = eManager.find(Usuario.class, 1);
		System.out.println(usuario.getNome());
		
		eManager.close();
		eManagerFactory.close();
		
	}

}
