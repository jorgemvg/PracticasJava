package com.edu.voBeanDto;

import java.util.Objects;

public class Empleado {

	long id;
	
	String name;
	
	String department;

	public Empleado(long id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
	    if (!(obj instanceof Empleado)) return false;
	    Empleado empleado = (Empleado) obj;
	    return Objects.equals(getId(), empleado.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	



}
