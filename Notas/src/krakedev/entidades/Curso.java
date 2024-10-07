package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiantes> estudiantes;

	public ArrayList<Estudiantes> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public String BuscarEstudiantePorCedula(Estudiantes estudiante) {
		for(int i=0;i<estudiantes.size();i++) {
			String Cedula = estudiantes.get(i).getCedula();
			if (estudiante.getCedula().equals(Cedula)) {
				System.out.println("El estudiante se encuentra registrado en el curso");
			}
		}
		return null;
	}
	
    public void matricularEstudiantes(Estudiantes estudiante) {
        if (this.estudiantes == null) { 
            // Si la lista es null por alguna razón, la inicializamos
            this.estudiantes = new ArrayList<>();
        }
        
        // Recorre la lista para verificar si el estudiante ya está matriculado
        for (Estudiantes estudiantePorMatricular : estudiantes) {
            if (estudiante.equals(estudiantePorMatricular)) {
                return; // Si el estudiante ya está matriculado, termina el método
            }
        }

        // Si no se encuentra en la lista, lo añade
        estudiantes.add(estudiante);
    }

	public double calcularPromedioCurso() {
		double promedios=0.0;
		for(int i=0;i<estudiantes.size();i++) {
			Estudiantes est = estudiantes.get(i);
			double promedio = est.calcularPromedioNotasEstudiante();
			promedios+=promedio;
		} 
		double promedioCurso = promedios/estudiantes.size();
		return promedioCurso;
	}
	
	public void mostrar() {
		for (int i=0;i<estudiantes.size();i++) {
			System.out.println("Curso [nombre="+estudiantes.get(i).getNombre()+", apellido="+estudiantes.get(i).getApellido()+", cedula="+estudiantes.get(i).getCedula()+"]");
		}
	}
}
