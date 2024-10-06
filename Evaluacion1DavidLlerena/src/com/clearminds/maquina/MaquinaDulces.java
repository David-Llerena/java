package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> Celdas;
	private double Saldo;
	
	public ArrayList<Celda> getCeldas() {
		return Celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		Celdas = celdas;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

    public MaquinaDulces() {
        Celdas = new ArrayList<>();
        Saldo = 0.0;
    }
	
	public void agregarCelda(String codigo) {
        Celda nuevaCelda = new Celda(codigo);
        Celdas.add(nuevaCelda);
	}
	
    public void mostrarConfiguracion() {
        System.out.println("Configuración de la máquina:");
        for (int i = 0; i < Celdas.size(); i++) {
            System.out.print("Celda"+(i+1)+":" +Celdas.get(i).getCodigo());
        }
    }
   
    public Celda buscarCelda(String codigo) {
        for (int i = 0; i < Celdas.size(); i++) {
            Celda celda = Celdas.get(i);
            if (celda.getCodigo().equals(codigo)) {
                return celda;
            }
        }
        return null; 
    }

    public void cargarProducto(Producto producto,String codigo, int items) {
    	Celda celdaRecuperada=buscarCelda(codigo);
    	celdaRecuperada.ingresarProducto(producto, items);
    }
    
    public void mostrarProductos() {
       for (int i = 0; i < Celdas.size(); i++) {
           System.out.print("Celda:"+Celdas.get(i).getCodigo()+" "+"Stock:"+Celdas.get(i).getStock());
           if(this.Celdas.get(i).getProducto()!= null) {
	   			System.out.print(" Producto:"+this.Celdas.get(i).getProducto().getCodigo());
	   			System.out.println(" Precio:"+this.Celdas.get(i).getProducto().getPrecio());
   			}else {
   				System.out.println(" La celda no tiene producto!!!");
   			}
         
       }  System.out.println("Saldo: "+ this.Saldo);
   }
   	
    public Producto buscarProductoEnCelda(String codigo) {
   		for (int i = 0; i < Celdas.size(); i++) {
   			if(this.Celdas.get(i).getCodigo().equals(codigo)){
   				return this.Celdas.get(i).getProducto();
   			}
   		}
		return null;
   	}
   	
    public double consultarPrecio(String codigo) {
   		for (int i = 0; i < Celdas.size(); i++) {
   			if(this.Celdas.get(i).getCodigo().equals(codigo) && this.Celdas.get(i).getProducto()!= null){
   				return this.Celdas.get(i).getProducto().getPrecio();
   			}
   		}
		return Saldo; 
	  }
 
    public Celda buscarCeldaProducto(String codigo) {
        for (int i = 0; i < Celdas.size(); i++) {
            Producto producto = this.Celdas.get(i).getProducto();
            if (producto != null && producto.getCodigo().equals(codigo)) {
                return this.Celdas.get(i);
            }
        }
        return null;
    }

    public void incrementarProductos(String codigo, int items) {
        Celda celdaEncontrada = buscarCeldaProducto(codigo);
        for (int i = 0; i < Celdas.size(); i++) {
            if (celdaEncontrada != null) {
                Celda celda = Celdas.get(i);
                int stockActual = celda.getStock();
                celda.setStock(stockActual+items);
            } else {
                System.out.println("No se encontró el producto con el código: " + codigo);
            }
        }

    }
    
    public void vender(String codigo) {
        for (Celda celda : Celdas) {  
            if (celda.getCodigo().equals(codigo)) {  
                int stockActual = celda.getStock();
                celda.setStock(stockActual - 1);
                double precioActual = celda.getProducto().getPrecio();
                this.setSaldo(this.getSaldo() + precioActual); 
            }
        }
    }
    public double venderConCambio(String codigo, double valor) {
        for (Celda celda : Celdas) { 
        	if (celda.getCodigo().equals(codigo)) {  
                int stockActual = celda.getStock();
                if (stockActual <= 0) {
                    return valor; 
                }             
                double precioActual = celda.getProducto().getPrecio();
                if (valor < precioActual) {
                    return valor; 
                }         
                celda.setStock(stockActual - 1);
                double vuelto = valor - precioActual;
                this.setSaldo(this.getSaldo() + precioActual); 
                return vuelto;
            }
        }
        return valor;
    }
    
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<>();

        for (int i = 0; i < Celdas.size(); i++) { 
        	Producto producto = this.Celdas.get(i).getProducto();
	            if (producto.getPrecio() <= limite) {
	                productosMenores.add(producto);
	            }
	        }
         return productosMenores;
    }
    
    public void mostrarMenores() {
        for (int i = 0; i < Celdas.size(); i++) { 
        	Producto producto = this.Celdas.get(i).getProducto();
        	System.out.println("Nombre: "+producto.getNombre()+" "+"Precio: "+producto.getPrecio());
        }
    }
}

	



