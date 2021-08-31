package com.practica.banco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank2 implements Serializable {

	private List<Customer> clientes;
	private int numeroClientes;
	
	private Map<String,Customer> clientesMap;

	public Bank2() {
		numeroClientes = 0;
		clientes = new ArrayList<>();
		clientesMap = new HashMap();
		
	}

	public Map<String, Customer> getClientesMap() {
		return clientesMap;
	}

	public void setClientesMap(Map<String, Customer> clientesMap) {
		this.clientesMap = clientesMap;
	}

	
	
	
}
