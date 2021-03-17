package com.edu.ordenar.busqueda;

public class CriterioAlumnoNombre extends Criterio<Alumno>{

	@Override
	public int comparar(Alumno a, Alumno b) {
		return a.getNombre().compareTo(b.getNombre());
	}
}