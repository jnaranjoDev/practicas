package com.practica.genericos;

public class MiClaseGenerica <T, I> {
	
	private T id;
	private I nombre;
	public MiClaseGenerica(T id, I nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public I getNombre() {
		return nombre;
	}
	public void setNombre(I nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		MiClaseGenerica <Integer, String> miclase = new MiClaseGenerica <Integer, String>(1,"Javier");
		
		miclase.getNombre();
	}
}
