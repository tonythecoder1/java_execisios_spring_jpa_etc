package base_dados_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Criar_tabela_pessoas {
	
	public static void main(String[] args) throws SQLException {
		
		String sqlString = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		Connection conexao = Conexao_geral.getConnection();
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sqlString);
		
		System.out.println();
		conexao.close();
	}

}
