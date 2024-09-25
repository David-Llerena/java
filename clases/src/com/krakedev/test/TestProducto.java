package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();

		//Producto A
		productoA.setNombre("Acetaminofen");
		productoA.setDescripcion("Farmaco analgesico y antipiretico");
		productoA.setPrecio(0.50f);
		productoA.setStockActual(50);
		
		//Producto B
		productoB.setNombre("Diclofenaco");
		productoB.setDescripcion("Farmaco antiflamatorio no esteroide");
		productoB.setPrecio(1.0f);
		productoB.setStockActual(30);
		
		//Producto B
		productoC.setNombre("Ibuprofeno");
		productoC.setDescripcion("Farmaco que se usa para reducir la fiebre y el dolor");
		productoC.setPrecio(2.50f);
		productoC.setStockActual(60);
		
		//CONSOLA
		System.out.println("----------------PRODUCTO A------------------");
		System.out.println("El farmaco es: "+productoA.getNombre());
		System.out.println("Se describe como: "+productoA.getDescripcion());
		System.out.println("Tiene un precio de: "+productoA.getPrecio());
		System.out.println("Actualmente se tienen: "+productoA.getStockActual());
		System.out.println("----------------PRODUCTO B------------------");
		System.out.println("El farmaco es: "+productoB.getNombre());
		System.out.println("Se describe como: "+productoB.getDescripcion());
		System.out.println("Tiene un precio de: "+productoB.getPrecio());
		System.out.println("Actualmente se tienen: "+productoB.getStockActual());
		System.out.println("----------------PRODUCTO C------------------");
		System.out.println("El farmaco es: "+productoC.getNombre());
		System.out.println("Se describe como: "+productoC.getDescripcion());
		System.out.println("Tiene un precio de: "+productoC.getPrecio());
		System.out.println("Actualmente se tienen: "+productoC.getStockActual());
	}

}
