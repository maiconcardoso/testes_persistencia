package com.persistencia.controller.test.client;

import java.sql.SQLException;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

public class DeleteClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Client client = new Client();
		client.setId(4);
		ClientDao clientDao = new ClientDao();
		clientDao.delete(client);
	}
}
