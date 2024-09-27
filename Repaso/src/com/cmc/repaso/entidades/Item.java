package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
		super();
		this.nombre = nombre;
		this.productosActuales = productosActuales;
		this.productosDevueltos = productosDevueltos;
		this.productosVendidos = productosVendidos;
	}
	public void imprimir() {
		System.out.println("El nombre del Item es: "+ nombre);
		System.out.println("Los productos actuales son: "+ productosActuales);
		System.out.println("Los productos Devueltos son: "+ productosDevueltos);
		System.out.println("Los productos vendidos son: "+ productosVendidos);
	}
	public void vender(int vendidos) {
		this.productosActuales=this.productosActuales-vendidos;
		this.productosVendidos=this.productosVendidos+vendidos;
	}
	public void devolver(int vendidos) {
		this.productosActuales=this.productosActuales+vendidos;
		this.productosVendidos=this.productosVendidos-vendidos;
		this.productosDevueltos=this.productosDevueltos+vendidos;
	}
}
