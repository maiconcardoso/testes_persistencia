package com.persistencia.controller.client;

import java.sql.SQLException;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

public class InsertClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Client custumer = new Client("Bilbo Bolseiro", "bilboaventureiro@gmail.com", "(44) 3041-1013");
		ClientDao custumerDao = new ClientDao();
		custumerDao.create(custumer);
	}
}
