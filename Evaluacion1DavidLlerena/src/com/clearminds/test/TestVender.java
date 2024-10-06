package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1").getCodigo());
		maquina.agregarCelda(new Celda("A2").getCodigo());
		maquina.agregarCelda(new Celda("B1").getCodigo());
		maquina.agregarCelda(new Celda("B2").getCodigo());
		
		Producto producto=new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "B1", 5);
		
		Producto producto2=new Producto("Doritos",0.70,"D456");
		maquina.cargarProducto(producto2, "A1", 3);
		
		maquina.vender("A1");
		maquina.vender("B1");
		
		maquina.mostrarProductos();
	}

}
