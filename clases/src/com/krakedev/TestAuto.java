package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		//Se instancian los dos autos y se referencian a las variables auto1 y auto2
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		//auto1 se modifican los valores
		auto1.setMarca("Hyundai");
		auto1.setAnio(2022);
		auto1.setPrecio(24000);
		
		//auto2 se modifican los valores
		auto2.setMarca("Kia");
		auto2.setAnio(2021);
		auto2.setPrecio(22000);
		
		//Se muestran los valores de los dos autos por 1consola
		System.out.println("----------------El Auto 1------------------");
		System.out.println("El primer auto es de marca: "+auto1.getMarca());
		System.out.println("El primer auto es del anio: "+auto1.getAnio());
		System.out.println("El primer auto tiene un precio de: "+auto1.getPrecio());
		System.out.println("----------------El Auto 2------------------");
		System.out.println("El segundo auto es de marca: "+auto2.getMarca());
		System.out.println("El segundo auto es del anio: "+auto2.getAnio());
		System.out.println("El segundo auto tiene un precio de: "+auto2.getPrecio());
	
	}

}
