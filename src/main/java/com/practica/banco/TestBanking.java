package com.practica.banco;

public class TestBanking {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(200);
		
		Customer c1 = new Customer("Jane","Smith");
		
		SavingAccount sa = new SavingAccount(500,3);
		
		Customer c2 = new Customer("Owen","Bryant");
		
		c1.setAccount(acc1);
		
		acc1.deposit(150);
		acc1.withdraw(300);
		acc1.withdraw(1000);

	}

}
