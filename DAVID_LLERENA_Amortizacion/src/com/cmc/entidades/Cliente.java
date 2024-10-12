package com.cmc.entidades;

import java.util.ArrayList;

import com.cmc.evaluacion.Prestamo;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamos;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    // Método para obtener los préstamos del cliente
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

public Cliente(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		 this.prestamos = new ArrayList<>(); 
	}
	public void mostrarCliente() {
//		System.out.println("[cedula= "+cedula+", nombre= "+nombre+", apellido= "+apellido+"]");
		System.out.println("Cliente: "+nombre+" "+apellido);
	}
	
}
