package com.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import java.util.List;
import java.util.ArrayList;

import com.persistencia.model.Client;

public class ClientDao {
	
	// Declarando o método de conexão
	Connection con = null;
	
	public boolean create(Client custumer) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO tb_client (name, email, phone) VALUES (?,?,?)";
		try {
			con = new ConnectionDatabase().connection();
			PreparedStatement pstm = con.prepareStatement(sql);
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
	
	public List<Client> readAll() throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM tb_client";
		List<Client> clientList = new ArrayList<>();
		try {
			con = new ConnectionDatabase().connection();
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				Client client = new Client();
				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setEmail(rs.getString("email"));
				client.setPhone(rs.getString("phone"));
				clientList.add(client);
			}
			return clientList;
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public boolean update(Client custumer) throws SQLException, ClassNotFoundException{
		String sql = "UPDATE tb_client set name=?, email=?, phone=? where id=?";
		try {
			con = new ConnectionDatabase().connection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, custumer.getName());
			pstm.setString(2, custumer.getEmail());
			pstm.setString(3, custumer.getPhone());
			pstm.setInt(4, custumer.getId());
			pstm.executeUpdate();
			return true;
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean delete(Client custumer) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM tb_client WHERE id=?";
		try {
			con = new ConnectionDatabase().connection();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, custumer.getId());
			pstm.executeUpdate();
			return true;
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
}
