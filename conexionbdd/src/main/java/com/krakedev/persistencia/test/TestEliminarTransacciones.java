package com.krakedev.persistencia.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestEliminarTransacciones {

	private  static final Logger LOGGER=LogManager.getLogger(TestEliminarPersona.class);
	
	public static void main(String[] args) throws Exception {
		int codigoEliminar = 7;
		LOGGER.trace("Eliminando transaccion de codigo: " + codigoEliminar);
		try {
			AdminTransacciones.eliminar(codigoEliminar);
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}
	}
}
