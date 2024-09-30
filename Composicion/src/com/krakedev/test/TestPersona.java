package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("David");
		p1.setApellido("Llerena");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av. siempre viva");
		dir.setCalleSecundaria("la que cruza");
		dir.setNumero("N-47");
		
		
		p1.setDireccion(dir);
		
		
		String nombre=p1.getNombre();	
		Direccion d1=p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
		Persona p2=new Persona();
		p2.setNombre("Enner");
		p2.setApellido("Valencia");
		
		Direccion d2=new Direccion("Av. guayaquil", "Av. Quito","S/N");
		p2.setDireccion(d2);
		
		p2.imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("XX","YY", "123"));
		p3.imprimir();
		
		
		
		
	}
 
}
