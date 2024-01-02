package com.persistencia.controller.test.client;

import java.sql.SQLException;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

public class UpdateClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Client client = new Client(3, "Sam Wise Gand", "samamigodefrodo@gmail.com", "(44) 3047-1006");
		ClientDao clientDao = new ClientDao();
		clientDao.update(client);
	}
}
