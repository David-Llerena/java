package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b;
		Persona p; //Declaro una variable de tipo persona
		p=new Persona("David", 27, 1.72);// crear el objeto o instanciando el objeto
		 
	 	System.out.println("Hola Mundo");//sysout crtl space
	 	System.out.println("nombre: "+ p.getNombre());
	 	System.out.println("edad: "+ p.getEdad());
	 	System.out.println("estatura: "+ p.getEstatura());
	}

}
