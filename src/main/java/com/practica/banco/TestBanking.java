package com.practica.banco;

public class TestBanking {

	public static void main(String[] args) {
		
		Bank banco = new Bank();	
		System.out.println("Creating the customer Jane Smith.");	
		Customer jane = new Customer("Jane","Smith");
		
		banco
		
		SavingAccount savingAccountJane = new SavingAccount(500,3);
		jane.setAccount(savingAccountJane);
		
		Customer owen = new Customer("Owen","Bryant");
		
		CheckingAccount checkingAccountOwen = new CheckingAccount(500);
		owen.setAccount(checkingAccountOwen);
		Customer tim = new Customer("Tim", "Soley");
		CheckingAccount checkingAccountTimAndMaria = new CheckingAccount(500,500);
		tim.setAccount(checkingAccountTimAndMaria);
		Customer maria = new Customer("Maria","Soley");
		maria.setAccount(tim.getAccount());
		
		
		
		savingAccountJane.withdraw(150);
		savingAccountJane.deposit(22.50);
		savingAccountJane.withdraw(47.62);
		savingAccountJane.withdraw(400);
		
		System.out.println("Balance de Jane and Tim"+checkingAccountTimAndMaria.getBalance());
		

		
		

	}
	
	

}
