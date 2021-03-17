package com.edu.ordenar.busqueda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Alumno /*implements Comparable<Alumno>*/ {

	private String nombre;
	private int edad;
	private double notaPromedio;
	
	public Alumno() {
		Random r = new Random();
		this.nombre = "Nombre" + r.nextInt(998);
		this.edad = r.nextInt(100);
		this.notaPromedio = round1(5 * r.nextDouble());
	}
	
	public double round1(Double val) {
	    return new BigDecimal(val.toString()).setScale(1,RoundingMode.HALF_UP).doubleValue();
	}
	
	public Alumno(String nombre, int edad, double notaPromedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaPromedio = notaPromedio;
	}
	
	/*
	@Override
	public int compareTo(Alumno otroAlumno) {
		
		return this.edad - otroAlumno.edad;
	}
*/
	
	@Override
	public String toString() {
		return this.nombre + " " + this.edad + " " + this.notaPromedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaPromedio() {
		return notaPromedio;
	}

	public void setNotaPromedio(double notaPromedio) {
		this.notaPromedio = notaPromedio;
	}
}
