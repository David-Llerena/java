package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarPersona {
	private  static final Logger LOGGER=LogManager.getLogger(TestActualizarPersona.class);
	public static void main(String[] args) throws Exception {
		
		EstadoCivil ec=new EstadoCivil("S","soltero");
		Persona p=new Persona("0926324237","David","Llerena",ec);
        p.setNumeroHijos(2);
        p.setEstatura(1.75);
        p.setCantidadAhorrada(new BigDecimal("1000.50"));


        LOGGER.trace("Actualizando persona...");
		try {
			
			Date fechaNac=Convertidor.convertirFecha("1996/08/27");
			Date horaNac=Convertidor.convertirHora("15:00");
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			AdminPersonas.insertar(p);
			
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}


	}

}
