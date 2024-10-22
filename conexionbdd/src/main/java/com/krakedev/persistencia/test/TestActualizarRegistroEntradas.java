package com.krakedev.persistencia.test;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarRegistroEntradas {
	private  static final Logger LOGGER=LogManager.getLogger(TestActualizarRegistroEntradas.class);
	public static void main(String[] args) throws Exception {
		Transacciones t= new Transacciones (7,"12345","D");
        LOGGER.trace("Actualizando Registro de entrada...");
		try {
			
			Date fecha=Convertidor.convertirFecha("2024/10/30");
			Date hora=Convertidor.convertirHora("15:00");
			
			t.setFecha(fecha);
			t.setHora(hora);
			AdminTransacciones.actualizar(t);
			
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}


	}

}
