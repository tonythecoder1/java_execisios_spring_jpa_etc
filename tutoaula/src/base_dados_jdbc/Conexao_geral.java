package base_dados_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class Conexao_geral {
	
	public static Connection getConnection() {
		
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "12345678";
			
			return DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
