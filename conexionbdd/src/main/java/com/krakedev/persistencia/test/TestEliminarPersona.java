package com.krakedev.persistencia.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminarPersona {
	private  static final Logger LOGGER=LogManager.getLogger(TestEliminarPersona.class);
	
	public static void main(String[] args) throws Exception {
		// Cédula de la persona a eliminar
		String cedulaEliminar = "0926324237";

		// Probar el método eliminar
		LOGGER.trace("Eliminando persona con cédula: " + cedulaEliminar);
		try {
			AdminPersonas.eliminar(cedulaEliminar);
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}
	}
}
