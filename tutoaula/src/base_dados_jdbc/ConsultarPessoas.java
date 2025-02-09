package base_dados_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao_geral.getConnection();
		String sql_query = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado_query = stmt.executeQuery(sql_query);
		
		List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
		
		while (resultado_query.next()) {
			int codigo = resultado_query.getInt("codigo");
			String nome = resultado_query.getString("nome");
			
			lista_pessoas.add(new Pessoa(codigo,nome));
		}
		
		lista_pessoas.stream().forEach(e -> System.out.println("ID: " + e.id + " Nome: " + e.nome));
		
		
		
		stmt.close();
		conexao.close();
	}

}
