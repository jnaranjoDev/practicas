package com.refrescos.practica;

import java.util.ArrayList;
import java.util.List;

public class testMaquina {

	public static void main(String[] args) {
		
		
		
		List<Refresco> listaRefresco = new ArrayList<>();
		Maquina maquina = new Maquina(listaRefresco,40);
		Refresco cocaCola = new Refresco("Coca cola",5,3);
		Refresco kasNaranja = new Refresco("Kas Naranja",5,2);
		
		maquina.reponer(kasNaranja);
		maquina.reponer(cocaCola);
		maquina.mostrarInformeVentas();
		maquina.vender(kasNaranja,10);
		maquina.vender(cocaCola,10);
		maquina.mostrarInformeVentas();

	}

}
