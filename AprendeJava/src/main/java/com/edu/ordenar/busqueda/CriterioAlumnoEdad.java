package com.edu.ordenar.busqueda;

public class CriterioAlumnoEdad extends Criterio<Alumno>{

	@Override
	public int comparar(Alumno a, Alumno b) {
		return a.getEdad() - b.getEdad();
	}
}