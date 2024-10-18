package com.krakedev.estaticos.logica;
import java.util.ArrayList;
import com.krakedev.estaticos.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> Alarmas;
	
	
	public AdminAlarmas() {
		Alarmas=new ArrayList<Alarma> ();
	}


	public ArrayList<Alarma> getAlarmas() {
		return Alarmas;
	}


	public void agregarAlarma(Alarma alarma) {
		Alarmas.add(alarma);
	}
	
}
