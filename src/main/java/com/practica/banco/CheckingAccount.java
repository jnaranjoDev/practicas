package com.practica.banco;

public class CheckingAccount extends Account {

	private double overdraftAmount;

	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = 0.0;
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(double initBalance) {
		super(initBalance);
	}

	public boolean withdraw(double amount) {
		double overdraftNeeded = 0.0;
		double overdraftAmount = 100;
		if (balance < amount) {
			overdraftNeeded = amount - balance;

			if (overdraftAmount < overdraftNeeded) {
				return false;
			} else {
				balance = 0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}

		} else {
			balance = balance - amount;
		}

		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
