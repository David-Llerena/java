package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cliente;
import com.cmc.entidades.Cuota;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<>();
	private ArrayList<Cliente> clientes;
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
    public Banco() {
        this.clientes = new ArrayList<>();
        this.prestamos=new ArrayList<Prestamo>();
    }
	
	public Cliente buscarCliente(String cedula) {
		for(int i=0;i<clientes.size();i++) {
			String cedCliente=clientes.get(i).getCedula();
			if(cedCliente==cedula) {
				return clientes.get(i); 
			}
		}return null;
	}
	
	public void registrarCliente(Cliente cliente) {
	    if (cliente != null) {
	        for (int i = 0; i < clientes.size(); i++) {
	            if (cliente.getCedula().equals(clientes.get(i).getCedula())) {
	                System.out.println("Cliente ya existe: " + cliente.getCedula());
	                return;
	            }
	        }
	        System.out.print("Cliente registrado: " + cliente.getNombre() + " " + cliente.getApellido());
	        clientes.add(cliente);
	    } else {
	        System.out.println("Error: El cliente no puede ser nulo.");
	    }
	}
	
//    public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
//        boolean clienteEncontrado = false;
//        for (Cliente cliente : clientes) {
//            if (cedulaCliente.equals(cliente.getCedula())) {
//                prestamos.add(prestamo);
//                clienteEncontrado = true;
//                break;
//            }
//        }
//        if (!clienteEncontrado) {
//            return;
//        }
//    }
	public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
	    boolean clienteEncontrado = false;

	    // Busca el cliente por cédula
	    for (Cliente cliente : clientes) {
	        if (cedulaCliente.equals(cliente.getCedula())) {
	            // Asigna el préstamo directamente a la lista de préstamos del cliente
	            cliente.agregarPrestamo(prestamo);
	            clienteEncontrado = true;
	            break;
	        }
	    }

	    if (!clienteEncontrado) {
	        System.out.println("Cliente no encontrado.");
	    }
	}
    
//    public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
//        ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
//        for (int i = 0; i < prestamos.size(); i++) {
//            Prestamo prestamoN = prestamos.get(i);
//            if (clientes.get(i).getCedula()==cedulaCliente) {
//                prestamosCliente.add(prestamoN);
//                clientes.get(i).mostrarCliente();
//                prestamosCliente.get(i).mostrarPrestamos();
//            }
//        }
//        if (prestamosCliente.isEmpty()) {
//            return null;
//        }
//        
//        return prestamosCliente;
//    }
	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
	    for (Cliente cliente : clientes) {
	        if (cliente.getCedula().equals(cedulaCliente)) {
	            return cliente.getPrestamos();  // Devuelve los préstamos del cliente
	        }
	    }
	    return new ArrayList<>();  // Si no se encuentra, devuelve una lista vacía
	}
}

