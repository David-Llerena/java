package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.RegistroEntradas;
import com.krakedev.persistencia.servicios.AdminRegistroEntradas;

public class TestConsultarRegistroEntradasPorFecha {

	public static void main(String[] args) {
		try {
		    ArrayList<RegistroEntradas> registros = AdminRegistroEntradas.buscarPorFecha("2024-08-26","2024-08-27");
		    for (RegistroEntradas registro : registros) {
		        System.out.println(registro);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}
