package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A").getCodigo());
        maquina.agregarCelda(new Celda("B").getCodigo());
        maquina.agregarCelda(new Celda("C").getCodigo());
        maquina.agregarCelda(new Celda("D").getCodigo());

		Producto producto = new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "B", 4);
		Producto producto2 = new Producto( "Gatorade", 2.54,"PRTO");
		maquina.cargarProducto(producto2, "D", 5);

		maquina.mostrarProductos();
	}
}
