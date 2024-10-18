package com.krakedev.estaticos;

public class Calculos {
	//la sentencia final hace que el valor no se pueda cambiar,
	//es decir convierte la variable en una constante
	// las constantes siempre todo en mayusculas
	private final double IVA=12;
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
	
}
