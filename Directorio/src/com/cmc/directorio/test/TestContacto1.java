package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("claro","092632445690",10);
		Contacto c = new Contacto("David",telef,32);
		AdminContactos adm = new AdminContactos();
		System.out.println("El nombre del contacto es: "+c.getNombre());
		System.out.println("La operadora del contacto es: "+ telef.getOperadora());
		System.out.println("El numero telefonico del contacto es: "+ telef.getNumero());
		System.out.println("El peso del contacto es: "+c.getPeso());
		Telefono telef2 = new Telefono("Movi","09263243490",15);
		Contacto c2 = new Contacto ("Andres", telef2,15);
		adm.buscarMasPesado(c, c2);
		adm.compararOperadoras(c, c2);
	}
	
}
