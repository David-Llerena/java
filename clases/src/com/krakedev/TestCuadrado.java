package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		double area1;
		double area2;
		double area3;
		double perimetro1;
		double perimetro2;
		double perimetro3;
		
		c1.lado=10;
		c2.lado=15;
		c3.lado=23;
		
		area1=c1.calcularArea();
		area2=c2.calcularArea();
		area3=c3.calcularArea();
		perimetro1=c1.calcularPerimetro();	
		perimetro2=c2.calcularPerimetro();	
		perimetro3=c3.calcularPerimetro();	
		
		System.out.println("El area de C1 es: "+ area1);
		System.out.println("El perimetro de C1 es: "+ perimetro1);
		System.out.println("El area de C2 es: "+ area2);
		System.out.println("El perimetro de C2 es: "+ perimetro2);
		System.out.println("El area de C3 es: "+ area2);
		System.out.println("El perimetro de C3 es: "+ perimetro2);
		
		
	}

}
