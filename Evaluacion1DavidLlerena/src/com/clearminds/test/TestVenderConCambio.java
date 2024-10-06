package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1").getCodigo());
        maquina.agregarCelda(new Celda("A2").getCodigo());
        maquina.agregarCelda(new Celda("B1").getCodigo());
        maquina.agregarCelda(new Celda("B2").getCodigo());
		
		Producto producto=new Producto("KE34",0.85,"Papitas");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456",0.70,"Doritos");
		maquina.cargarProducto(producto2, "A1", 6);
		
		double cambio=maquina.venderConCambio("B1",1);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		
	}

}
