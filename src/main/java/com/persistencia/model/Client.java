package com.persistencia.model;

public class Client implements java.io.Serializable {

	// Código de serialização da classe
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private int id;
	private String name;
	private String email;
	private String phone;
	
	
	// Construtores
	public Client() {
		
	}
	public Client(int id, String name, String email, String telefone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = telefone;
	}
	public Client(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
	// Métodos Modificadores
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Métodos Acessores
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
	
	@Override
	public String toString() {
		return "[Id: " + this.id + " Name: " + this.name + " Email: " + this.email + " Telefone: " + this.phone + "]\n";
	}
	
}
