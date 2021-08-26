package com.practica.animales;

public abstract class Animal {

	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Soy un animal y ando con:"+legs);
	}
	
	public abstract void eat();
	
}
