package com.cmc.repaso.entidades;

public class Validacion {
	public boolean ValidarMonto(int monto) {
		if (monto>0) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	}
}
