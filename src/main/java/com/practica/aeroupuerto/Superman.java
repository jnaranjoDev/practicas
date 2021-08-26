package com.practica.aeroupuerto;

public class Superman extends Kryptoniano implements ObjetoVolador  {

	@Override
	public void despegar() {
		System.out.println("Soy un superman y despego");
		
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un superman y aterrizo");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un superman y vuelo");
	}
	
	public void comer() {
		System.out.println("Soy superman y me gusta comer");
	}
	
	public void saltarEdificio() {
		System.out.println("Soy superman y salto edificios");
	}
	public void deterBala() {
		System.out.println("Soy superman y detengo las balas");
	}
	

}
