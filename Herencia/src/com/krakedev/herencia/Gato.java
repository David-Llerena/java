package com.krakedev.herencia;

public class Gato extends Animal{
	@Override
	public void dormir() {
//		super.dormir();
		System.out.println("Gato Durmiendo");
	}

    public void maullar() {
        System.out.println("El gato está maullando");
    }

    public void maullar(String adjetivo) {
        System.out.println("gato maullando " + adjetivo);
    }
}
