package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Papipollo",2.50);
		producto.setPrecio(3);
		producto.calcularPrecioPromo(10);

	}

}