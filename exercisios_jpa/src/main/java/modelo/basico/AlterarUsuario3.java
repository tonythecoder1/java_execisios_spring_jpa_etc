package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercisios_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		Usuario usuario = eManager.find(Usuario.class, 1);
		
		eManager.getTransaction().begin();
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		usuario.setNome("Nicole");
		usuario.setEmail("nicole@hotmail.com");
		
		eManager.merge(usuario);
		eManager.getTransaction().commit();
	}

}
