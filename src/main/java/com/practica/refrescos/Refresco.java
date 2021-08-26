package com.practica.refrescos;

import java.io.Serializable;

public class Refresco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private int precio;
	private String sabor;
	private int cl;
	private boolean agotado;
	private int stock;
	
	
	public Refresco() {
		super();
	}

	public Refresco(String marca,int precio, int stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getCl() {
		return cl;
	}

	public void setCl(int cl) {
		this.cl = cl;
	}

	public boolean isAgotado() {
		return agotado;
	}

	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
