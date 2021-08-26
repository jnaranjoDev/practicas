package com.practica.animales;

public class Fish extends Animal implements Pet {

	protected Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getName() {
		System.out.println("El pez se llama Juan");
		
	}

	@Override
	public void setName() {
		System.out.println("El pez lo llamo Pepe");
		
	}

	@Override
	public void play() {
		System.out.println("El pez juega");
		
	}

	@Override
	public void eat() {
		System.out.println("El pez come");
		
	}
	
	@Override
	public void walk() {
		System.out.println("Yo no ando, vivo la vida nadando");
	}

}
