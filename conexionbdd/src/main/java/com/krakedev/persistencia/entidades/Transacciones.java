package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Transacciones {
	private int codigo;
	private String numero_cuenta;
	private BigDecimal monto;
	private String tipo;
	private Date fecha;
	private Date hora;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Transacciones(int codigo, String numero_cuenta, String tipo) {
		super();
		this.codigo = codigo;
		this.numero_cuenta = numero_cuenta;
		this.tipo = tipo;

	}
	public Transacciones() {
		super();
	}
	@Override
	public String toString() {
		return "Transacciones [codigo=" + codigo + ", numero_cuenta=" + numero_cuenta + ", monto=" + monto + ", tipo="
				+ tipo + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
}
