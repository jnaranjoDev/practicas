package com.twt.ejercicio2;

public class Cat extends Animal implements Pet{

	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		super(4);
	}

	@Override
	public void getName() {
		System.out.println("El gato se llama Juan");
		
	}

	@Override
	public void setName() {
		System.out.println("El gato lo llamo Pepe");
		
	}

	@Override
	public void play() {
		System.out.println("El gato juega");
		
	}

	@Override
	public void eat() {
		System.out.println("El gato come");
		
	}
	
	
	
}
