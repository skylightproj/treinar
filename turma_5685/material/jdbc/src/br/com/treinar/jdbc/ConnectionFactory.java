package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/contato", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
