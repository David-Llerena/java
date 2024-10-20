package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		String a = null;
		System.out.println("Inicio");
		try {
			System.out.println("ABRE CONEXION CON BDD");
			a.substring(3);
			System.out.println("Fin");
		}catch(Exception ex) {
		System.out.println("Entra al catch");	
		}finally {
			System.out.println("Ingreso al Finally");
			System.out.println("CIERRA LA CONEXION BDD");
		}
		System.out.println("Fuera del catch");
	}
}
	 