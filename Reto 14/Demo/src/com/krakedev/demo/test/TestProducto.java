package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(1310,"Harina");
		producto1.setDescripcion("Esto es harina");
		producto1.setPeso(10);
		
		System.out.println("El nombre producto es: "+ producto1.getNombre());
		System.out.println("El codigo producto es: "+ producto1.getCodigo());
		System.out.println("La descripcion del producto es: "+ producto1.getDescripcion());
		System.out.println("El peso del producto es: "+ producto1.getPeso());
	}

}
