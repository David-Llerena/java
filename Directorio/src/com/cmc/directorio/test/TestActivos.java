package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("claro","0912345678",15);
		Contacto c = new Contacto ("David", telef,16);
		System.out.println("El nombre del contacto es: "+c.getNombre());
		System.out.println("La operadora del contacto es: "+ telef.getOperadora());
		System.out.println("El numero telefonico del contacto es: "+ telef.getNumero());
		System.out.println("El peso del contacto es: "+c.getPeso());
		System.out.println("Tiene whatsapp: "+telef.isTieneWhatsapp());
		System.out.println("Esta activo: "+c.isActivo());
		AdminContactos adm = new AdminContactos();
		adm.activarUsuario(c);
		System.out.println("============Nuevos Valores=========");
		System.out.println("El nombre del contacto es: "+c.getNombre());
		System.out.println("La operadora del contacto es: "+ telef.getOperadora());
		System.out.println("El numero telefonico del contacto es: "+ telef.getNumero());
		System.out.println("El peso del contacto es: "+c.getPeso());
		System.out.println("Tiene whatsapp: "+telef.isTieneWhatsapp());
		System.out.println("Esta activo: "+c.isActivo());
	}

}
