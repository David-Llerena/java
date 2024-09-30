package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono t1,Telefono t2,Telefono t3) {
		int contadorMovi=0;
		
	    if (t1 != null && t1.getOperadora() == "movi") {
	        contadorMovi++;
	    } 
	    if (t2 != null && t2.getOperadora() == "movi") {
	        contadorMovi++;
	    }
	    if (t3 != null && t3.getOperadora() == "movi") {
	        contadorMovi++;
	    }
	    return contadorMovi;
	}
	
	public int contarClaro(Telefono t1,Telefono t2,Telefono t3,Telefono t4) {
		int contadorClaro=0;
		
	    if (t1 != null && t1.getOperadora() == "claro") {
	    	contadorClaro++;
	    } 
	    if (t2 != null && t2.getOperadora() == "claro") {
	    	contadorClaro++;
	    }
	    if (t3 != null && t3.getOperadora() == "claro") {
	    	contadorClaro++;
	    }
	    if (t4 != null && t4.getOperadora() == "claro") {
	    	contadorClaro++;
	    }
	    return contadorClaro;
	}

}
