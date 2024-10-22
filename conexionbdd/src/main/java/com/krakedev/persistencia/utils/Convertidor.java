package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATOFECHA = "yyyy/MM/dd";
	private static final String FORMATOHORA = "HH:mm";
	private  static final Logger LOGGER=LogManager.getLogger(Convertidor.class);
	
	public static Date convertirFecha(String fechaStr) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATOFECHA);
		Date fechaDate = null;
		try {
			LOGGER.debug("Conviertiendo Fecha "+fechaStr);
			fechaDate=sdf.parse(fechaStr);
			LOGGER.debug("Fecha Convertida "+fechaStr);
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto"+fechaStr);
			throw new Exception("La fecha no tiene el formato correcto"+fechaStr);
		}
		return fechaDate;
	}
	
	public static Date convertirHora(String horaStr) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATOHORA);
		Date horaDate = null;
		try {
			LOGGER.debug("Conviertiendo Hora "+horaStr);
			horaDate=sdf.parse(horaStr);
			LOGGER.debug("Hora Convertida "+horaStr);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto"+horaStr);
			throw new Exception("La hora no tiene el formato correcto"+horaStr);
		}
		return horaDate;
	}
}
