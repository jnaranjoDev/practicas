package com.practica.refrescos;

import java.io.Serializable;
import java.util.List;

public class Maquina implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ventas;
	private int refrescosTotales;
	private int saldo;
	private int saldoTemp;
	public List<Refresco> refrescos;
	
	
	public Maquina(List<Refresco> refrescos, int saldo) {
		super();
		this.saldo = saldo;
		this.refrescos = refrescos;
	}
	
	public void reponer(Refresco refresco) {
		this.refrescos.add(refresco);
		this.refrescosTotales++;
	}
	public String vender(Refresco refresco,int saldoTemp) {
		if( refresco.isAgotado()) {
			System.out.println("No hay stock");
			 return "Dinero devuelto: "+this.saldoTemp;
		}else if((saldoTemp - refresco.getPrecio()) > saldo) {
			
			System.out.println("Saldo de maquina insuficiente");
			return "Dinero devuelto: "+saldoTemp;
		}else if(saldo < (saldoTemp-refresco.getPrecio())){
			System.out.println("La maquina no tiene saldo");
			return "Dinero devuelto: "+saldoTemp;
		}else if(refresco.getStock() <= 0){

				System.out.println("No hay stock");
				refresco.setAgotado(true);
				return "Dinero devuelto: "+saldoTemp;		
		}else {
			int cambio = saldoTemp-refresco.getPrecio();
			if(saldoTemp > refresco.getPrecio()) {
				refresco.setStock(refresco.getStock()-1);
				saldo += refresco.getPrecio()-cambio;
				refrescosTotales--;
				ventas++;
				return "Dinero devuelto: "+cambio;
			}else {
				refresco.setStock(refresco.getStock()-1);
				saldo += refresco.getPrecio()-cambio;
				refrescosTotales--;
				ventas++;
				return "Dinero devuelto: "+cambio;
			}
			
			
			
			
			
		}
		
		
		
	}
	
	public void mostrarInformeVentas() {
		System.out.println("El numero de refrescos totales es: "+refrescosTotales);
		System.out.println("El numero de ventas totales es: "+ventas);
		System.out.println("El saldo de la maquina es: "+saldo);
	}
	
}
