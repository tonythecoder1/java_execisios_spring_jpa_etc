package base_dados_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		String nomeString;
		String sql_string = "";
		
		Connection conexao = Conexao_geral.getConnection();
	
		
		System.out.println("Insira o nome");
		nomeString = entrada.next();
		
		sql_string = "INSERT INTO pessoas (nome) VALUES (?)";
		
		PreparedStatement pstmt = conexao.prepareStatement(sql_string);
		pstmt.setString(1, nomeString);
		
		pstmt.execute();
		
		System.out.println(nomeString);
		
		
		
	}

}
