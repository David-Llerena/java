package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha(2004,12,12);
//		fecha1.setAnio(20);
//		fecha1.setMes(12);
//		fecha1.setDia(12);
		
		System.out.println(fecha1.getAnio()+"/"+ fecha1.getMes()+"/"+ fecha1.getDia());
	}

}
