package com.practica.banco;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3717131186762238385L;
	protected double balance;

	protected Account(double initBalance) {
		super();
		this.balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		if((this.balance + amt) < this.balance) {
			System.out.println("No puedes depositar en negativo");
			return false;
		}else {
			System.out.println("Dinero depositado");
			System.out.println("El saldo actual es: "+this.balance);
			this.balance += amt;
			return true;
		}
		
	}
	
	public boolean withdraw(double amt) {
		if( (this.balance - amt) < 0) {
			System.out.println("No puedes retirar tanto dinero");
			System.out.println("El saldo actual es: "+this.balance);
			return false;
		}else {
			this.balance -= amt;
			System.out.println("Dinero retirado");
			System.out.println("El saldo actual es: "+this.balance);
			return true;
		}
		
		
		
	}
	
	
	
	
}
