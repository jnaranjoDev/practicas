package com.practica.banco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bank implements Serializable {

	private List<Customer> clientes;
	private int numeroClientes;

	public Bank() {
		numeroClientes = 0;
		clientes = new ArrayList<>();
		
	}

	
	
	
}
