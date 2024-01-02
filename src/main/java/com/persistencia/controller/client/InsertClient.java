package com.persistencia.controller.client;

import java.sql.SQLException;

import com.persistencia.dao.ClientDao;
import com.persistencia.model.Client;

public class InsertClient {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Client custumer = new Client("Frodo Bolseiro", "frodobolseiro@gmail.com", "(44) 3046-1003");
		ClientDao custumerDao = new ClientDao();
		custumerDao.create(custumer);
	}
}
