package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();

		//Producto A
		productoA.nombre="Acetaminofen";
		productoA.descripcion="Farmaco analgesico y antipiretico";
		productoA.precio=0.50f;
		productoA.stockActual=50;
		
		//Producto B
		productoB.nombre="Diclofenaco";
		productoB.descripcion="Farmaco antiflamatorio no esteroide";
		productoB.precio=1.0f;
		productoB.stockActual=30;
		
		//Producto B
		productoC.nombre="Ibuprofeno";
		productoC.descripcion="Farmaco que se usa para reducir la fiebre y el dolor";
		productoC.precio=2.50f;
		productoC.stockActual=60;
		
		//CONSOLA
		System.out.println("----------------PRODUCTO A------------------");
		System.out.println("El farmaco es: "+productoA.nombre);
		System.out.println("Se describe como: "+productoA.descripcion);
		System.out.println("Tiene un precio de: "+productoA.precio);
		System.out.println("Actualmente se tienen: "+productoA.stockActual);
		System.out.println("----------------PRODUCTO B------------------");
		System.out.println("El farmaco es: "+productoB.nombre);
		System.out.println("Se describe como: "+productoB.descripcion);
		System.out.println("Tiene un precio de: "+productoB.precio);
		System.out.println("Actualmente se tienen: "+productoB.stockActual);
		System.out.println("----------------PRODUCTO C------------------");
		System.out.println("El farmaco es: "+productoC.nombre);
		System.out.println("Se describe como: "+productoC.descripcion);
		System.out.println("Tiene un precio de: "+productoC.precio);
		System.out.println("Actualmente se tienen: "+productoC.stockActual);
	}

}
