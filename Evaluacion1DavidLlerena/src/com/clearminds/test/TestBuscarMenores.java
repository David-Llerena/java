package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1").getCodigo());
		maquina.agregarCelda(new Celda("A2").getCodigo());
		maquina.agregarCelda(new Celda("B1").getCodigo());
		maquina.agregarCelda(new Celda("B2").getCodigo());
		
		Producto producto=new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "A1", 1);
		
		Producto producto2=new Producto("Doritos",0.50,"D456");
		maquina.cargarProducto(producto2, "A2", 1);
		
		Producto producto3=new Producto("Jet",0.25,"D123");
		maquina.cargarProducto(producto3, "B1", 1);
		
		Producto producto4=new Producto("DeTodito",0.60,"F456");
		maquina.cargarProducto(producto4, "B2", 1);

		System.out.println("Productos Menores: "+maquina.buscarMenores(6).size());
		maquina.mostrarMenores();

	}

}
