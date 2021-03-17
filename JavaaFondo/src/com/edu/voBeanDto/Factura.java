package com.edu.voBeanDto;

public class Factura implements Cloneable{

	String concepto;
	
	long importe;
	
	public Factura(String c, long i) {
		this.concepto = c;
		this.importe = i;
	}

	@Override
	public String toString() {
		
		return this.concepto +" - "+ this.importe;
	}
	
	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public long getImporte() {
		return importe;
	}

	public void setImporte(long importe) {
		this.importe = importe;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		//return new Factura(this.concepto, this.importe);
	}


	
	
	
}
