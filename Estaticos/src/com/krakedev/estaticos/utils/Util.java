package com.krakedev.estaticos.utils;

public class Util {
	public static String formatearHora(int numero) {
	    if (numero < 10) {
	        return "0" + numero;
	    }
	    return "" + numero;
	}
	public static String formatearDia(int numero) {
	    if (numero == DiasSemana.LUNES) {
	        return "Lunes";
	    } else if (numero == DiasSemana.MARTES) {
	        return "Martes";
	    } else if (numero == DiasSemana.MIERCOLES) {
	        return "Miércoles";
	    } else if (numero == DiasSemana.JUEVES) {
	        return "Jueves";
	    } else if (numero == DiasSemana.VIERNES) {
	        return "Viernes";
	    } else if (numero == DiasSemana.SABADO) {
	        return "Sábado";
	    } else if (numero == DiasSemana.DOMINGO) {
	        return "Domingo";
	    } else {
	        return "Día inválido";
	    }
	}
}
