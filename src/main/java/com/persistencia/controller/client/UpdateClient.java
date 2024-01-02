package com.persistencia.controller.client;

import java.sql.SQLException;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

public class UpdateClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Client client = new Client(1, "Bilbo Bolseiro", "bilbodocondado@gmail.com", "(44) 3046-1005");
		ClientDao clientDao = new ClientDao();
		clientDao.update(client);
	}
}
