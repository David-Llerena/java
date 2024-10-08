package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

        // Settear la dirección
        Direccion Direccion = new Direccion("Av. siempre Viva", "Calle 4");
        contacto.setDireccion(Direccion);
        
        Contacto contacto2 = new Contacto("9876543210", "Ana", "Gomez");
        Direccion Direccion2 = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto2.setDireccion(Direccion2);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
        
        System.out.println("\nInformación del Contacto (actualizada):");
        contacto2.imprimir();
    }
}

