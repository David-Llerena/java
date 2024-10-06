package com.krakedev.colecciones;

public class Persona {
	private String nombre;
	private String Apellido;
	private int edad;
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		Apellido = apellido;
	}
	
}
