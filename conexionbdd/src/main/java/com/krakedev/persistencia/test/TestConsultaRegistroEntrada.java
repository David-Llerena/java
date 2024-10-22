package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.RegistroEntradas;
import com.krakedev.persistencia.servicios.AdminRegistroEntradas;

public class TestConsultaRegistroEntrada {

	public static void main(String[] args) {
		try {
			RegistroEntradas registro = AdminRegistroEntradas.buscarPorCedula("1234567890");
			System.out.println(registro);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
// busqueda por clave primaria