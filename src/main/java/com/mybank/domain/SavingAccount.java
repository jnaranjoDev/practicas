package com.mybank.domain;

public class SavingAccount extends Account {
	
	private double interestRate;

	public SavingAccount(double initBalance, double interestRate) {
		super(initBalance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
