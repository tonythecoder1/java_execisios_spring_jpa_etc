package colecoes;

import java.util.ArrayList;

public class utilizador {
	
	String nome;
	
	private static ArrayList<utilizador> lista_geral= new ArrayList<utilizador>();
	
	
	public utilizador(String nome_r) {
		
		nome = nome_r;
		
	}
	
	public utilizador() {}
	
	public static void add_utilizador(String nome_r) {
		
		utilizador util = new utilizador(nome_r);
		lista_geral.add(util);
		
	}
	
	public String devolve_nome() {
		
		return nome;
	}
	
	public static ArrayList<utilizador> devolve_lista(){
		
		return lista_geral;
		
	}

}
