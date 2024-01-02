package com.persistencia.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionDatabase {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/persistencia?useTimeZone=true&serverTimeZone=UTC";
	private String username = "root";
	private String password = "mysql@123";
	
	public Connection connection() throws SQLException, ClassNotFoundException{
		
		Connection connection = null;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			return connection;
			
		} catch(SQLException e) {
			Logger.getLogger(e.getMessage());
			return null;
		} finally {
			connection.close();
		}
	}
}
