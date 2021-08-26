package com.practica.aeroupuerto;

public class Aeropuerto {

	public void despegar() {
		
		Ave ave = new Ave();
		Avion avion = new Avion(20,"ASDSADSA");
		Superman superman = new Superman();
		
		ave.despegar();
		avion.despegar();
		superman.despegar();
		
	}
	
	public void comer() {
		Ave ave = new Ave();
		Kryptoniano kryptoniano = new Kryptoniano();
		Superman superman = new Superman();
		
		ave.comer();
		kryptoniano.comer();
		superman.comer();
		
	}

}
