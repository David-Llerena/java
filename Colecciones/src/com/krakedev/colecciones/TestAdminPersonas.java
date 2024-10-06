package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Clark","Kent",30));
		admin.agregar(new Persona("Bruno","Diaz",25));
		
		admin.imprimir();
		Persona p1 = admin.buscarPorNombre("Bruno");
		System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
//		
//		Persona p2= admin.buscarPorNombre("Jose");
//		System.out.println("ENCONTRADO: "+p2.getApellido()+" "+p2.getEdad());
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("Mayores: "+personasMayores.size());
	}
}
