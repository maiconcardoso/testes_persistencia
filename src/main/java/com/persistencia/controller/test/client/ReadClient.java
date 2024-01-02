package com.persistencia.controller.test.client;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		List<Client> clientList = new ArrayList<>();
		ClientDao clientDao = new ClientDao();
		clientList = clientDao.readAll();
		for (Client client : clientList) {
			System.out.println(client);
		}
	}
}
