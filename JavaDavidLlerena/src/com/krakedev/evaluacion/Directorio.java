package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private Date fechaModificacion;
	private ArrayList<Contacto> contacto;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
	      this.contacto = new ArrayList<>();
	      this.correctos = new ArrayList<>();
	      this.incorrectos = new ArrayList<>();
	}

	public Directorio(Date fechaModificacion, ArrayList<Contacto> contacto) {
		this.fechaModificacion = new Date();
		this.contacto = contacto;
	}
	
    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }
    
    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }
    
	public ArrayList<Contacto> getContacto() {
		return contacto;
	}

	public boolean agregarContacto(Contacto contacto){
		//REQUERIMIENTO 7
//		this.contacto.add(contacto);
//		return true;
		//REQUERIMIENTO 8
        Contacto contactoExistente = buscarPorCedula(contacto.getCedula());
        if (contactoExistente == null) {
            this.contacto.add(contacto);
            this.fechaModificacion = new Date();//REQUERIMIENTO 9
            return true;
        } else {
            return false;
        }
	}
	
	public Contacto buscarPorCedula(String cedula) {
	    for (int i = 0; i < contacto.size(); i++) {
	        String ced = contacto.get(i).getCedula();
	        if (cedula.equals(ced)) {
	            return contacto.get(i);
	        }
	    }
	    return null;
	}
	
    public String consultarUltimaModificacion() {
        if (fechaModificacion == null) {
            return null;
        }
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatoFecha.format(fechaModificacion);
    }
    
    public int contarPerdidos() {
        int contador = 0;
        for (int i = 0; i < contacto.size(); i++) {
            if (contacto.get(i).getDireccion() == null) {
                contador += 1;
            }
        }
        return contador;
    }
    
    public int contarFijos() {
        int contador = 0;
        for (Contacto c : contacto) {
            for (Telefono tel : c.getTelefono()) {
                if (tel.getTipo().equals("Convencional") && tel.getEstado().equals("C")) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public void depurar() {
        correctos.clear();
        incorrectos.clear();
        for (Contacto c : contacto) {
            if (c.getDireccion() != null) {
                correctos.add(c);
            } else {
                incorrectos.add(c);
            }
        }
        contacto.clear();
    }	
}
