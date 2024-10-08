package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
        if (numero == null || tipo == null) {
            estado = "E";
        } else if (!tipo.equals("Movil") && !tipo.equals("Convencional")) {
            estado = "E";
        } else {
            int longitudRequerida = tipo.equals("Movil") ? 10 : 7;
            if (numero.length() != longitudRequerida) {
                estado = "E";
            } else {
                estado = "C";
            }
        }
    }
	
}
