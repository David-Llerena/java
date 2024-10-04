package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int Stock;
	private String Codigo;
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public Celda(String codigo) {
		Codigo = codigo;
	}
	public Celda() {
		
	}
	public void ingresarProducto(Producto producto, int stock) {
		this.producto=producto;
		this.Stock=stock;
	}
}
