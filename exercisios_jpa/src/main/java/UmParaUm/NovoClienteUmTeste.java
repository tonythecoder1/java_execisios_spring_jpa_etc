package UmParaUm;

import modelo.basico.Dao;

public class NovoClienteUmTeste {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("17C");
		Cliente cliente1Cliente = new Cliente("Jessica", assento);
		
		Dao<Object> dao = new Dao<>();
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente1Cliente)
			.fecharTransacao()
			.fechar_dao();
	}

}
