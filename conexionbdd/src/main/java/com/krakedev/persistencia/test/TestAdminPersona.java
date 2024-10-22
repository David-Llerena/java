package com.krakedev.persistencia.test;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {
	private  static final Logger LOGGER=LogManager.getLogger(TestAdminPersona.class);
	public static void main(String[] args) throws Exception{
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona("0926324237","David","Llerena",ec);
		try {
			
			Date fechaNac=Convertidor.convertirFecha("1996/08/27");
			Date horaNac=Convertidor.convertirHora("15:00");
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			AdminPersonas.actualizar(p);
			
		}catch(Exception e){
			LOGGER.error("Error en el sistema: "+e.getMessage());
			throw new Exception("Error en el sistema: "+e.getMessage());
		}
	}
}
 