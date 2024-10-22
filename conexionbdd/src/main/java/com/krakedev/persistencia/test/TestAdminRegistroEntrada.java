package com.krakedev.persistencia.test;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.RegistroEntradas;
import com.krakedev.persistencia.servicios.AdminRegistroEntradas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminRegistroEntrada {
	private  static final Logger LOGGER=LogManager.getLogger(TestAdminRegistroEntrada.class);
		public static void main(String[] args) throws Exception{
			RegistroEntradas re=new RegistroEntradas(9263,"0926324237");
			try {
				
				Date fecha=Convertidor.convertirFecha("2024/08/27");
				Date hora=Convertidor.convertirHora("15:00");
				
				re.setFecha(fecha);
				re.setHora(hora);
				AdminRegistroEntradas.insertar(re);
				
			}catch(Exception e){
				LOGGER.error("Error en el sistema: "+e.getMessage());
				throw new Exception("Error en el sistema: "+e.getMessage());
			}
		}

}
