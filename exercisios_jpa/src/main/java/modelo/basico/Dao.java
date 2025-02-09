package modelo.basico;

import java.nio.channels.UnsupportedAddressTypeException;
import java.security.PrivateKey;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import UmParaUm.Cliente;

public class Dao<E> {

	private static EntityManagerFactory emf;
	private EntityManager eManager;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercisios_jpa");
			
		} catch (Exception e) {
			
		}
	}
	
	public Dao() {
		this(null);
	}
	
	public Dao(Class<E> classe) {
		
		this.classe = classe;
		eManager = emf.createEntityManager();
	}
	
	public Dao<E> abrirTransacao(){
		eManager.getTransaction().begin();
		return this;
	}
	
	public Dao<E> fecharTransacao(){
		eManager.getTransaction().commit();
		return this;
	}
	
	public Dao<E> incluir(E entidade){ 
		eManager.persist(entidade);
		return this;
	}
	
	public Dao<E> incluirAtomico(E entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<E> obterTodos(int quantidade, int deslocamento){
	
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT u FROM " + classe.getName() + " u";
		TypedQuery<E> query = eManager.createQuery(jpql, classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
		
	}
	
	public E obter_cliente(Object id) {
		
		return eManager.find(classe, id);
		
	}
	
	public List<E> obter_todos2_total(){
		return this.obterTodos(10, 0);
	}
	
	public void fechar_dao() {
		eManager.close();
	}
	
	
	
	
	
	
	
}
