package com.cmc.test;

import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.CalculadoraAmortizacion;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion cal=new CalculadoraAmortizacion();
        double cuota = CalculadoraAmortizacion.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
