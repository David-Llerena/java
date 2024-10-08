package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		int randomNumber = (int) (Math.random() * 52);
		return randomNumber;
	}
}
