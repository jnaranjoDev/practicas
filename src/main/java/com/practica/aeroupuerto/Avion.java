package com.practica.aeroupuerto;

public class Avion extends Vehiculo implements ObjetoVolador{

	public Avion(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void despegar() {
		System.out.println("Soy un avión y despego");
		
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un avión y aterrizo");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un avión y vuelo");
	}
}
