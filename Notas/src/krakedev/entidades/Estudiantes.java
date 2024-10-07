package krakedev.entidades;

import java.util.ArrayList;

public class Estudiantes {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiantes(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		 this.notas = new ArrayList<>(); 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
	    if (nuevaNota != null) {
	        // Verificar si ya existe una nota para la misma materia
	        boolean materiaExistente = false;
	        for (int i = 0; i < notas.size(); i++) {
	            if (notas.get(i).getMateria().equals(nuevaNota.getMateria())) {
	                materiaExistente = true;
	                break;
	            }
	        }
	        
	        if (!materiaExistente) {
	            // Verificar que la calificación esté entre 0 y 10
	            if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
	                notas.add(nuevaNota);
	            }
	        }
	    }
	}
	
//	public void agregarNota(Nota nuevaNota) {
//	        for (int i=0;i<notas.size();i++) {
//	            if (notas.get(i).getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo()) ) {
//	            	if (notas.get(i).getCalificacion()>= 0 && notas.get(i).getCalificacion()<= 10) {	
//	            		notas.add(nuevaNota);
//	            	}
//	            }
//	        }
//	}       
	
	public void modificarNota(String codigo, double nuevaNota) {
        for (int i=0;i<notas.size();i++) {
        	Materia materia = notas.get(i).getMateria();
            if (materia.getCodigo().equals(codigo)) {
                if (notas.get(i).getCalificacion()>= 0 && notas.get(i).getCalificacion()<= 10) {
                	notas.get(i).setCalificacion(nuevaNota);
                }else {
                	System.out.println("NO SE ENCONTRO EL CODIGO");
                }
            }
        }
	}
	
	public double calcularPromedioNotasEstudiante() {
		double sumarNotas=0.0;
		double totalMaterias=0.0;
		for (int i=0;i<notas.size();i++) {
			double notaMateria=notas.get(i).getCalificacion();
			sumarNotas +=notaMateria;
		}
		double promedio = sumarNotas/notas.size();
		return promedio;
	}
	
	public void mostrar() {
		for (int i=0;i<notas.size();i++) {
			System.out.println("Estudiante [nombre="+getNombre()+", apellido="+getApellido()+", cedula="+getCedula()+", materia="+notas.get(i).getMateria().getNombre()+", calificacion ="+notas.get(i).getCalificacion()+"]");
		}
	}
	}
	
