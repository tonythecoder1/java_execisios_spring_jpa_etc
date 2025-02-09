import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class CriarUtilizador {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome_alterado = "";
		
		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("projeto_jpa");
		EntityManager eManager = eManagerFactory.createEntityManager();
		
		Usuario usuario = new Usuario("Bea");
		
		eManager.getTransaction().begin();
		eManager.persist(usuario);
		eManager.getTransaction().commit();
		
		System.out.println("Inserido com sucesso " + usuario.getNome());
		
		System.out.println("Insira o nome para efetura a alteraçao do utilizador: " + usuario.getNome());
		
		eManager.getTransaction().begin();
		
		nome_alterado = entrada.next();
		usuario.setNome(nome_alterado);
		eManager.merge(usuario);
		
		eManager.getTransaction().commit();
		
		
		
		
		
		
		
	}

}
