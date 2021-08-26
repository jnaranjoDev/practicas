package com.practica.animales;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat gato = new Cat("gatuco");
		Fish pez = new Fish(0);
		Spider spider = new Spider(8);
		
		gato.getName();
		spider.eat();
		pez.walk();
	}

}
