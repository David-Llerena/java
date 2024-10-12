package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {

	
	public static double calcularCuota(Prestamo prestamo) {
		double capital=prestamo.getMonto();
		double interes=((prestamo.getInteres())/100)/12;
		int plazo=prestamo.getPlazo();
		double dividendo=capital*interes;
		double divisor=(1- Math.pow(1+interes,- plazo));
		double cuota=dividendo/divisor;
		return cuota;
	}

	public CalculadoraAmortizacion() {
	}
	
    public void generarTabla(Prestamo prestamo) {
        // 1. Calcular la cuota
        double cuotaMensual = calcularCuota(prestamo);
        
        // 2. Inicializar cuotas en el arreglo
        inicializarCuotas(prestamo, cuotaMensual);
        
        // 3. Establecer valor de inicio del periodo
        establecerValorInicioPrimeraCuota(prestamo);
        
        // 4 y 5. Calcular valores para todas las cuotas
        calcularValoresCuotasTodasCuotas(prestamo);
        
        // 6. Ajustar última cuota
        ajustarUltimaCuota(prestamo);
    }
    
    public void inicializarCuotas(Prestamo prestamo, double cuotaMensual) {
        ArrayList<Cuota> cuotas = prestamo.getCuotas();
        for (Cuota cuota : cuotas) {
            cuota.setCuota(cuotaMensual);
        }
    }
    
    public void establecerValorInicioPrimeraCuota(Prestamo prestamo) {
        if (!prestamo.getCuotas().isEmpty()) {
            prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());
        }
    }
    
    public void calcularValoresCuotasTodasCuotas(Prestamo prestamo) {
        ArrayList<Cuota> cuotas = prestamo.getCuotas();
        double saldoActual = prestamo.getMonto();
        
        for (int i = 0; i < cuotas.size(); i++) {
            Cuota cuotaActual = cuotas.get(i);
            Cuota cuotaSiguiente = (i < cuotas.size() - 1) ? cuotas.get(i + 1) : null;
            
            calcularValoresCuota(cuotaActual, saldoActual, cuotaSiguiente);
            saldoActual = cuotaActual.getSaldo();
        }
    }

    public void calcularValoresCuota(Cuota cuotaActual, double saldoInicial, Cuota cuotaSiguiente) {
        double tasaMensual = 0.01;
        
        // Calcular interés
        double interes = Utilitarios.redondear(saldoInicial * tasaMensual);
        
        // Calcular abono a capital
        double abonoCapital = Utilitarios.redondear(cuotaActual.getCuota() - interes);
        
        // Calcular nuevo saldo
        double nuevoSaldo = Utilitarios.redondear(saldoInicial - abonoCapital);
        
        // Asignar valores a la cuota actual
        cuotaActual.setInteres(interes);
        cuotaActual.setAbonoCapital(abonoCapital);
        cuotaActual.setSaldo(nuevoSaldo);
        
        // Si existe una cuota siguiente, establecer su valor de inicio
        if (cuotaSiguiente != null) {
            cuotaSiguiente.setInicio(nuevoSaldo);
        }
    }
    
    public void ajustarUltimaCuota(Prestamo prestamo) {
        ArrayList<Cuota> cuotas = prestamo.getCuotas();
        if (!cuotas.isEmpty()) {
            Cuota ultimaCuota = cuotas.get(cuotas.size() - 1);
            
            // Ajustar el abono a capital para que sea igual al saldo inicial de la última cuota
            double nuevoAbonoCapital = ultimaCuota.getInicio();
            ultimaCuota.setAbonoCapital(nuevoAbonoCapital);
            
            // Ajustar la cuota total
            ultimaCuota.setCuota(nuevoAbonoCapital + ultimaCuota.getInteres());
            
            // Establecer el saldo final en 0
            ultimaCuota.setSaldo(0);
        }
    }
    
    public void mostrarTabla(Prestamo prestamo) {
        System.out.printf("%-4s | %-10s | %-10s | %-10s | %-14s | %-10s%n",
                "N°", "Inicio", "Cuota", "Interés", "Abono Capital", "Saldo");

        for (Cuota cuota : prestamo.getCuotas()) {
            System.out.printf("%-4d | $%-9.2f | $%-9.2f | $%-9.2f | $%-13.2f | $%-9.2f%n",
                    cuota.getNumero(),
                    cuota.getInicio(),
                    cuota.getCuota(),
                    cuota.getInteres(),
                    cuota.getAbonoCapital(),
                    cuota.getSaldo());
        }
    }
 }