package modelo.basico;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ObterUsuarios {
	
	public static void main(String[] args) {
		
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("exercisios_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		String query_jpql = "SELECT u FROM Usuario u";
		
		TypedQuery<Usuario> query = eManager.createQuery(query_jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> lista_consulta = query.getResultList();
		
		lista_consulta.stream().forEach(e -> System.out.println("Nome: " + e.getNome() + " Email: " + e.getEmail()));
		
		
		
		eManager.close();
		eManager.close();
	}

}
