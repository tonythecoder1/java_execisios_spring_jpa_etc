package base_dados_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
public static void main(String[] args) throws SQLException {
	
	Connection conexao = Conexao_geral.getConnection();
	String sql_query = "SELECT * FROM pessoas WHERE nome like ?";
	String nome_like = null;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe os valores existentes no nome a pesquisar: ");
	nome_like = entrada.next();
	
	PreparedStatement pstmt = conexao.prepareStatement(sql_query);
	pstmt.setString(1, "%" + nome_like + "%");
	
	ResultSet resultado_query = pstmt.executeQuery();
	
	List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
	
	while (resultado_query.next()) {
		int codigo = resultado_query.getInt("codigo");
		String nome = resultado_query.getString("nome");
		
		lista_pessoas.add(new Pessoa(codigo,nome));
	}
	
	lista_pessoas.stream().forEach(e -> System.out.println("ID: " + e.id + " Nome: " + e.nome));
	
	
	
	pstmt.close();
	conexao.close();
}

}
