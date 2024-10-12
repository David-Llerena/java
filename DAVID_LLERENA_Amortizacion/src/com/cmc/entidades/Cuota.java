package com.cmc.entidades;

import com.cmc.evaluacion.Utilitarios;

public class Cuota {
    private int numero;
    private double cuota;
    private double capital;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero) {
        this.numero = numero;
    }
    

    // Getters y setters utilizando el método Utilitario.redondear()
    public int getNumero(){
    	return numero;
    }
    public Cuota() {
    	
    }

    
    public double getCuota() {
        return Utilitarios.redondear(cuota);
    }
    
    public void setCuota(double cuota) {
        this.cuota = Utilitarios.redondear(cuota);
    }
    
    public double getCapital() {
        return Utilitarios.redondear(capital);
    }
    
    public void setCapital(double capital) {
        this.capital = Utilitarios.redondear(capital);
    }
    
    public double getInicio() {
        return Utilitarios.redondear(inicio);
    }
    
    public void setInicio(double inicio) {
        this.inicio = Utilitarios.redondear(inicio);
    }
    
    public double getInteres() {
        return Utilitarios.redondear(interes);
    }
    
    public void setInteres(double interes) {
        this.interes = Utilitarios.redondear(interes);
    }
    
    public double getAbonoCapital() {
        return Utilitarios.redondear(abonoCapital);
    }
    
    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = Utilitarios.redondear(abonoCapital);
    }
    
    public double getSaldo() {
        return Utilitarios.redondear(saldo);
    }
    
    public void setSaldo(double saldo) {
        this.saldo = Utilitarios.redondear(saldo);
    }

    public void mostrarPrestamo() {
        System.out.printf("%d | %.2f | %.2f | %.2f | %.2f | %.2f%n",
            numero, getCuota(), getCapital(), getInteres(), getAbonoCapital(), getSaldo());
    }
}
