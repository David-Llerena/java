package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi" ,"098234234",20);
		Telefono t2 = new Telefono("claro", "098123454",10);
		Telefono t3 = new Telefono("movi", "098212345",15);
		AdminTelefono adm=new AdminTelefono();
		int contador= adm.contarMovi(t1, t2, t3);
		System.out.println("La cantidad de Telefonos en la operadora movi son: "+ contador);
	}

}
