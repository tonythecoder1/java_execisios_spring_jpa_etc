package base_dados_jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = Conexao_geral.getConnection();
				
		java.sql.Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		System.out.println("Base de dados criada com sucesso");
		
		conexao.close();
	}

}
