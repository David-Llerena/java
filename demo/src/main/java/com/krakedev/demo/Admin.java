package com.krakedev.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	public void agregar() {
		//niveles en ese orden
		logger.warn("Mensaje de warn");
		logger.info("Mensaje de info");
		logger.debug("Mensaje de debug");
		logger.trace("Mensaje de trace");
		
		//siempre se ejecuta
		logger.error("Mensaje de error");

	}
}
