package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList <String> cadenas;
		String valorRecuperado;
		
		cadenas = new ArrayList<String>();
		System.out.println(cadenas.size());
		
		cadenas.add("Uno");//posicion 0
		cadenas.add("Dos");//poscion 1
		System.out.println(cadenas.size());
		
		valorRecuperado=cadenas.get(0);
		System.out.println(valorRecuperado);
		
		valorRecuperado=cadenas.get(1);
		System.out.println(valorRecuperado);
		
//		valorRecuperado=cadenas.get(2);// error al tratar de ingresar a un indice que no existe es indexoutofboundsexception
//		System.out.println(valorRecuperado);
		
		String cadena;
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i);
			System.out.println("cadena: "+cadena);
			
		}
	}

}
