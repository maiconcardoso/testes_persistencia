package com.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import com.persistencia.model.Client;

public class ClientDao {
	
	// Declarando o método de conexão
	Connection con = null;
	
	public boolean create(Client custumer) throws ClassNotFoundException, SQLException {
		String SQL = "INSERT INTO tb_client (name, email, phone) VALUES (?,?,?)";
		try {
			con = new ConnectionDatabase().connection();
			PreparedStatement pstm = con.prepareStatement(SQL);
			pstm.setString(1, custumer.getName());
			pstm.setString(2, custumer.getEmail());
			pstm.setString(3, custumer.getPhone());
			pstm.execute();		
			return true;
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public 
}
