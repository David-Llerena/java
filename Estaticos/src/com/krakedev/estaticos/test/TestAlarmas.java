package com.krakedev.estaticos.test;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;
import com.krakedev.estaticos.logica.AdminAlarmas;
import com.krakedev.estaticos.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminAlarmas admin=new AdminAlarmas();
		Alarma alarma1=new Alarma(DiasSemana.LUNES,8,19);
		Alarma alarma2=new Alarma(DiasSemana.MIERCOLES,9,20);
		Alarma alarma3=new Alarma(DiasSemana.VIERNES,10,21);
		Alarma alarma4=new Alarma(DiasSemana.DOMINGO,11,21);
		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		admin.agregarAlarma(alarma4);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
