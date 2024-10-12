package com.cmc.test;

import com.cmc.entidades.*;
import com.cmc.evaluacion.*;

public class TestCalculadora2 {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 15);

        CalculadoraAmortizacion calculadoraAmortizacion = new CalculadoraAmortizacion();
		calculadoraAmortizacion.generarTabla(prestamo);

		calculadoraAmortizacion.mostrarTabla(prestamo);
    }
}