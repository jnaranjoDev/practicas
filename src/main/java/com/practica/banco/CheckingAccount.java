package com.practica.banco;

public class CheckingAccount extends Account{

	private double overdraftAmount;
	
	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = 0.0;
		// TODO Auto-generated constructor stub
	}
	
	

	public CheckingAccount(double initBalance) {
		super(initBalance);
	}

	
	public boolean withdraw(double amount){
		
		if (balance < amount) {
			double overdraftNeeded = amount - balance;
			
		}
		
		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
