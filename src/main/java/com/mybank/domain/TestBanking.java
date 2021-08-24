package com.mybank.domain;

public class TestBanking {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(200);
		
		Customer c1 = new Customer("pepe","martinez");
		
		c1.setAccount(acc1);
		
		acc1.deposit(150);
		acc1.withdraw(300);
		acc1.withdraw(1000);

	}

}
