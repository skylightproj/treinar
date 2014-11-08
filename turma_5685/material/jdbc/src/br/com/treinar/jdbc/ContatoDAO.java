package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {

	// a conex�o com o banco de dados
	private Connection connection;

	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionar(Contato contato) {
	    String sql = "insert into contatos " +
	            "(nome, email, endereco, dataNascimento)" +
	            " values (?,?,?,?)";

	    try {
	        // prepared statement para inser��o
	        PreparedStatement stmt = connection.prepareStatement(sql);

	        // seta os valores

	        stmt.setString(1, contato.getNome());
	        stmt.setString(2, contato.getEmail());
	        stmt.setString(3, contato.getEndereco());
	        stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));

	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	
	
}
