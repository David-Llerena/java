package com.krakedev.persistencia.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminRegistroEntradas;

public class TestEliminarRegistroEntrada {

	private  static final Logger LOGGER=LogManager.getLogger(TestEliminarRegistroEntrada.class);
	
	public static void main(String[] args) throws Exception {
		// Cédula de la persona a eliminar
		int codigo = 9263;

		// Probar el método eliminar
		LOGGER.trace("Eliminando registro con codigo: " + codigo);
		try {
			AdminRegistroEntradas.eliminar(codigo);
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}
	}
}
