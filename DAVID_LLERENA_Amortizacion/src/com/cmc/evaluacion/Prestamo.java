package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cuota;

public class Prestamo {
	private double Monto;
	private double Interes;
	private int Plazo;
	private ArrayList<Cuota> cuotas;
	

	public double getMonto() {
		return Monto;
	}
	public void setMonto(double monto) {
		Monto = monto;
	}
	public double getInteres() {
		return Interes;
	}
	public void setInteres(double interes) {
		Interes = interes;
	}
	public int getPlazo() {
		return Plazo;
	}
	public void setPlazo(int plazo) {
		Plazo = plazo;
	}
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}
	
	public Prestamo(double monto, double interes, int plazo) {
		Monto = monto;
		Interes = interes;
		Plazo = plazo;
        this.cuotas = new ArrayList<>();
        for (int i = 0; i < plazo; i++) {
            cuotas.add(new Cuota(i + 1));
        }
	}
	
	public void mostrarPrestamos() {
		System.out.println("[monto= "+Monto+", interes= "+Interes+", plazo= "+Plazo+"]");
	}
	
}
