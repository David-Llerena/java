package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;
	
	
    public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		Saldo = saldo;
	}


	public MaquinaDulces() {
        this.Celda1 = new Celda();
        this.Celda2 = new Celda();
        this.Celda3 = new Celda();
        this.Celda4 = new Celda();
        this.Saldo = 0.0;
    }


	public void configurarMaquina(String c1,String c2,String c3,String c4) {
        this.Celda1.setCodigo(c1);
        this.Celda2.setCodigo(c2);
        this.Celda3.setCodigo(c3);
        this.Celda4.setCodigo(c4);
	}
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: "+this.Celda1.getCodigo());
		System.out.println("CELDA 2: "+this.Celda2.getCodigo());
		System.out.println("CELDA 3: "+this.Celda3.getCodigo());
		System.out.println("CELDA 4: "+this.Celda4.getCodigo());
	}
	public Celda buscarCelda(String codigoCelda) {
		if (this.Celda1.getCodigo()==codigoCelda) {
			return Celda1;
		}else if (this.Celda2.getCodigo()==codigoCelda) {
			return Celda2;
		}else if (this.Celda3.getCodigo()==codigoCelda) {
			return Celda3;
		}else if (this.Celda4.getCodigo()==codigoCelda) {
			return Celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto producto,String codigo,int items) {
		Celda celdaRecuperada=buscarCelda(codigo);
	    celdaRecuperada.ingresarProducto(producto,items);	
	}
	public void mostrarProducto() {
		System.out.println("***************CELDA "+this.Celda1.getCodigo());
		System.out.println("Stock: "+ this.Celda1.getStock());
		if(this.Celda1.getProducto()!= null) {
			System.out.println("Nombre Producto:"+this.Celda1.getProducto().getNombre());
			System.out.println("Precio Producto:"+this.Celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+this.Celda1.getProducto().getCodigo());

		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***************CELDA "+this.Celda2.getCodigo());
		System.out.println("Stock: "+ this.Celda2.getStock());
		if(this.Celda2.getProducto()!= null) {
			System.out.println("Nombre Producto:"+this.Celda2.getProducto().getNombre());
			System.out.println("Precio Producto:"+this.Celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+this.Celda2.getProducto().getCodigo());

		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***************CELDA "+this.Celda3.getCodigo());
		System.out.println("Stock: "+ this.Celda1.getStock());
		if(this.Celda3.getProducto()!= null) {
			System.out.println("Nombre Producto:"+this.Celda3.getProducto().getNombre());
			System.out.println("Precio Producto:"+this.Celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+this.Celda3.getProducto().getCodigo());

		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***************CELDA "+this.Celda4.getCodigo());
		System.out.println("Stock: "+ this.Celda1.getStock());
		if(this.Celda4.getProducto()!= null) {
			System.out.println("Nombre Producto:"+this.Celda4.getProducto().getNombre());
			System.out.println("Precio Producto:"+this.Celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+this.Celda4.getProducto().getCodigo());

		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Saldo: "+Saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		if(this.Celda1.getCodigo()==codigo){
			return this.Celda1.getProducto();
		}else if(this.Celda2.getCodigo()==codigo) {
			return this.Celda2.getProducto();
		}else if(this.Celda3.getCodigo()==codigo) {
			return this.Celda3.getProducto();
		}else if(this.Celda4.getCodigo()==codigo) {
			return this.Celda4.getProducto();
		}else {
			return null;
		}
	}
	public double consultarPrecio(String codigo) {
		if(this.Celda1.getCodigo()==codigo){
			return this.Celda1.getProducto().getPrecio();
		}else if(this.Celda2.getCodigo()==codigo) {
			return this.Celda2.getProducto().getPrecio();
		}else if(this.Celda3.getCodigo()==codigo) {
			return this.Celda3.getProducto().getPrecio();
		}else if(this.Celda4.getCodigo()==codigo) {
			return this.Celda4.getProducto().getPrecio();
		}else {
			return Saldo;
		}
	}
	public Celda buscarCeldaProducto(String codigo) {
	    if (codigo != null) {
	        if (Celda1.getProducto() != null && codigo.equals(Celda1.getProducto().getCodigo())) {
	            return Celda1;
	        } else if (Celda2.getProducto() != null && codigo.equals(Celda2.getProducto().getCodigo())) {
	            return Celda2;
	        } else if (Celda3.getProducto() != null && codigo.equals(Celda3.getProducto().getCodigo())) {
	            return Celda3;
	        } else if (Celda4.getProducto() != null && codigo.equals(Celda4.getProducto().getCodigo())) {
	            return Celda4;
	        }
	    }
	    return null;
	}
	public void incrementarProductos(String codigo, int items) {
	    if (codigo == null || items <= 0) {
	        return; // O lanzar una excepción si es apropiado
	    }

	    Celda celdaEncontrada = buscarCeldaProducto(codigo);
	    
	    if (celdaEncontrada != null) {
	        int stockActual = celdaEncontrada.getStock();
	        celdaEncontrada.setStock(stockActual + items);
	    }
	}
	public void vender(String codigo) {
		if(this.Celda1.getCodigo()==codigo){
			int stockActual = this.Celda1.getStock();
			this.Celda1.setStock(stockActual-1);
			double precioActual= this.Celda1.getProducto().getPrecio();
			this.setSaldo(precioActual+Saldo);
		}else if(this.Celda2.getCodigo()==codigo) {
			int stockActual = this.Celda2.getStock();
			this.Celda2.setStock(stockActual-1);
			double precioActual= this.Celda2.getProducto().getPrecio();
			this.setSaldo(precioActual+Saldo);
		}else if(this.Celda3.getCodigo()==codigo) {
			int stockActual = this.Celda3.getStock();
			this.Celda3.setStock(stockActual-1);
			double precioActual= this.Celda3.getProducto().getPrecio();
			this.setSaldo(precioActual+Saldo);
		}else if(this.Celda4.getCodigo()==codigo) {
			int stockActual = this.Celda4.getStock();
			this.Celda4.setStock(stockActual-1);
			double precioActual= this.Celda4.getProducto().getPrecio();
			this.setSaldo(precioActual+Saldo);
		}
		mostrarProducto();	
	}
	public double venderConCambio(String codigo, double valor) {
		if(this.Celda1.getCodigo()==codigo){
			int stockActual = this.Celda1.getStock();
			this.Celda1.setStock(stockActual-1);
			double precioActual= this.Celda1.getProducto().getPrecio();
			double vuelto=valor-precioActual;
			this.setSaldo(vuelto);
			this.Celda1.getProducto().setPrecio(this.Saldo);
			return vuelto;		
		}else if(this.Celda2.getCodigo()==codigo) {
			int stockActual = this.Celda2.getStock();
			this.Celda2.setStock(stockActual-1);
			double precioActual= this.Celda2.getProducto().getPrecio();
			double vuelto=valor-precioActual;
			this.setSaldo(vuelto);
			this.Celda2.getProducto().setPrecio(this.Saldo);
			return vuelto;	
		}else if(this.Celda3.getCodigo()==codigo) {
			int stockActual = this.Celda3.getStock();
			this.Celda3.setStock(stockActual-1);
			double precioActual= this.Celda3.getProducto().getPrecio();
			double vuelto=valor-precioActual;
			this.setSaldo(vuelto);
			this.Celda3.getProducto().setPrecio(this.Saldo);
			return vuelto;	
		}else if(this.Celda4.getCodigo()==codigo) {
			int stockActual = this.Celda4.getStock();
			this.Celda4.setStock(stockActual-1);
			double precioActual= this.Celda4.getProducto().getPrecio();
			double vuelto=valor-precioActual;
			this.setSaldo(vuelto);
			this.Celda4.getProducto().setPrecio(this.Saldo);
			return vuelto;	
		}else {
			return Saldo;
		}
	}
}

