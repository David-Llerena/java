package com.clearminds.componentes;

public class Producto {
	private String Nombre;
	private double Precio;
	private String Codigo;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public Producto(String nombre, double precio, String codigo) {
		Nombre = nombre;
		Precio = precio;
		Codigo = codigo;
	}
	
	public Producto() {
		
	}
	
	public void incrementarPrecio(int porcentajeIncremento) {
	    double porcentaje = porcentajeIncremento / 100.0;  
	    double incremento = porcentaje * this.Precio;
	    this.Precio = this.Precio + incremento;
	}
	public void disminuirPrecio(double porcentajeDecremento) {
		this.Precio=this.Precio-porcentajeDecremento;
	}
}
