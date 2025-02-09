package UmParaUm;

import modelo.basico.Dao;

public class ObterClientesAssento {
	
	public static void main(String[] args) {
		
		Dao<Cliente> dao = new Dao<>(Cliente.class);
		Object cliente_encontradoCliente = dao.obter_cliente(1);
		
		Cliente c1Cliente = (Cliente) cliente_encontradoCliente;
	
		System.out.println(c1Cliente.getNome());
		System.out.println(c1Cliente.getAssento().getNome());
		dao.fechar_dao();
		
		Dao<Assento> dao_assento = new Dao<>(Assento.class);
		
		Assento assento_encontradoAssento = dao_assento.obter_cliente(3);
		System.out.println(assento_encontradoAssento.getCliente().getNome() + " |Assento: " + assento_encontradoAssento.getNome());
		
		dao_assento.fechar_dao();
			
		
	}

}
