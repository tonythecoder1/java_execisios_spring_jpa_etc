package UmParaUm;

import java.awt.print.Printable;

import modelo.basico.Dao;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("18A");
		Cliente c1Cliente = new Cliente("Gui", assento);
		
		Dao<Object> dao = new Dao<>();
		dao.incluirAtomico(c1Cliente);
	
		
		
	}

}
