package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;
import com.krakedev.persistencia.utils.Convertidor;

public class TestInsertarTransaccion {
	private  static final Logger LOGGER=LogManager.getLogger(TestInsertarTransaccion.class);
		public static void main(String[] args) throws Exception{
			Transacciones t= new Transacciones (7,"12345","C");
			t.setMonto(new BigDecimal("1000.50"));
			try {
				Date fecha=Convertidor.convertirFecha("2024/10/24");
				Date hora=Convertidor.convertirHora("14:00");
				
				t.setFecha(fecha);
				t.setHora(hora);
				AdminTransacciones.insertar(t);
				
			}catch(Exception e){
				LOGGER.error("Error en el sistema: "+e.getMessage());
				throw new Exception("Error en el sistema: "+e.getMessage());
			}
		}
}
