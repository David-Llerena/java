package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi","09941234123", 10);
		System.out.println("La operadora es: "+ t1.getOperadora());
		System.out.println("El numero es: "+ t1.getNumero());
		System.out.println("El codigo es: "+ t1.getCodigo());
	}

}
