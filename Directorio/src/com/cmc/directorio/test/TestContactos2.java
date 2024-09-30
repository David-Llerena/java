package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("Movi","0912456783",10);
		Contacto c = new Contacto("Carla",telef,12);
		AdminContactos adm = new AdminContactos();
		Telefono telef2 = new Telefono("Claro","0912345678",15);
		Contacto c2 = new Contacto ("Andrea", telef2,16);
		adm.buscarMasPesado(c, c2);
		adm.compararOperadoras(c, c2);

	}
		
}
