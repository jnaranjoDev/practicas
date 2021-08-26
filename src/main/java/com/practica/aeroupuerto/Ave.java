package com.practica.aeroupuerto;

public class Ave implements ObjetoVolador{

	@Override
	public void despegar() {
		System.out.println("Soy un ave y despego");
		
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un ave y aterrizo");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un ave y vuelo");
	}
	
	public void hacerNido() {
		System.out.println("soy un ave y hago un nido");
	}
	public void ponerHuevos() {
		System.out.println("Soy un ave y pongo huevos");
	}
	
	public void comer() {
		System.out.println("Soy un ave y me gusta comer");
	}

}
