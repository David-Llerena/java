package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1").getCodigo());
        maquina.agregarCelda(new Celda("A2").getCodigo());
        maquina.agregarCelda(new Celda("B1").getCodigo());
        maquina.agregarCelda(new Celda("B2").getCodigo());
		
		Producto producto=new Producto("Papitas",2.54,"KE34");
		maquina.cargarProducto(producto, "B1", 4);
		
		System.out.println("Precio en B1:"+maquina.consultarPrecio("B1"));

	}
}
