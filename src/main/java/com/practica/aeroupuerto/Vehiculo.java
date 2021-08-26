package com.practica.aeroupuerto;

import java.io.Serializable;

/**
 * Clase que modela los datos de un vehiculo
 * La carga maxima permitida se asigna en kg
 * 
 * @author begonaolea
 * @version 1.0.0
 */
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//variables  de clase - 1 para toda la aplicacion
	public static final double CARGA_MAXIMA_DEFECTO = 1000.0;
	
	// atributos - variables de instancia (objeto)
	private String matricula;
	private double cargaMaxima;
	private double cargaActual;
	private int numCajas;

	//constructores
	public Vehiculo(double cargaMaxima, String matricula) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
		this.cargaActual = 0;
		this.numCajas = 0;
	}
	
	
	//métodos getters y setters
	

	public double getCargaMaxima() {
		return cargaMaxima;
	}
	

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCargaActual() {
		return cargaActual;
	}


	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}


	public int getNumCajas() {
		return numCajas;
	}

	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
				+ ", numCajas=" + numCajas + "]";
	}
	
	public void calcularFuel() {
		System.out.println("Calculando el fuel...");
		System.out.println();
	}



	
	
	
}
