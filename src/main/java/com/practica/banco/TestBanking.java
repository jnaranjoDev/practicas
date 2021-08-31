package com.practica.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TestBanking {

	public static void main(String[] args) {
		
		Bank banco = new Bank();	
		System.out.println("Creating the customer Jane Smith.");	
		Customer jane = new Customer("Jane","Smith","72180498F");
		
		
		
		Customer owen = new Customer("Owen","Bryant","72180498j");
		
		CheckingAccount checkingAccountOwen = new CheckingAccount(500);
		owen.setAccount(checkingAccountOwen);
		Customer tim = new Customer("Tim", "Soley","72180498w");
		CheckingAccount checkingAccountTimAndMaria = new CheckingAccount(500,500);
		tim.setAccount(checkingAccountTimAndMaria);
		Customer maria = new Customer("Maria","Soley","72180498k");
		maria.setAccount(tim.getAccount());
		
		
	
		
		System.out.println("Balance de Jane and Tim"+checkingAccountTimAndMaria.getBalance());
		
		Map<String,Customer> listaClientes =  new HashMap();
		
		listaClientes.put(maria.getDni(), maria);
		listaClientes.put(jane.getDni(), jane);
		listaClientes.put(owen.getDni(), owen);
		listaClientes.put(tim.getDni(), tim);

		banco.setClientesMap(listaClientes);
		
		 System.out.println("Recorrer map por sus values");
		Collection<Customer> valores = listaClientes.values();
		
		for(Customer c: valores)
			System.out.println("Valores Cliente : "+c);
		
		System.out.println("Recorrer los keys del map");
        Set<String> claves = listaClientes.keySet();
        for(String k:claves){
            System.out.println(k  + " -> " + listaClientes.get(k));
        }
        

        
        List<Account> cuentas = new ArrayList<Account>();
        cuentas.add(checkingAccountTimAndMaria);
        cuentas.add(checkingAccountOwen);
        
        for(Account c: cuentas) {
        	System.out.println("Cuentas: "+c);
        }
        
        
        

	}
	
	

}
