package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi" ,"098234234",20);
		Telefono t2 = new Telefono("claro", "098123454",10);
		Telefono t3 = new Telefono("movi", "098212345",15);
		Telefono t4 = new Telefono("claro", "091234445",40);
		AdminTelefono adm=new AdminTelefono();
		int contador= adm.contarClaro(t1, t2, t3,t4);
		System.out.println("La cantidad de Telefonos en la operadora claro son: "+ contador);
	}
}
