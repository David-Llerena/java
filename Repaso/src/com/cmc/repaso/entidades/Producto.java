package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {

		if (precio<0) {
			this.precio=precio*(-1);
			
		}else {
			this.precio = precio;
		}
	}
	public double calcularPrecioPromo(double descuento) {
		double precioDescuento;
		double descuentoSobrePrecio=descuento/100;
		precioDescuento=descuentoSobrePrecio*this.precio;
		double precioFinal = this.precio - precioDescuento;
		return precioFinal;
	}
	
}
