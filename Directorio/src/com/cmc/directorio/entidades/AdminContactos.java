package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else {
			return c2;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		Telefono telef1 = c1.getTelefono();
		String operadora1=telef1.getOperadora();
		Telefono telef2 = c2.getTelefono();
		String operadora2=telef2.getOperadora();
		
		if(operadora1==operadora2) {
			return true;
		}else { 
			return false;
		}
	}
	public void activarUsuario(Contacto c) {
		Telefono telef = c.getTelefono();
		if(telef.isTieneWhatsapp()==false) {
			c.setActivo(true);
		}
		
	}
}
