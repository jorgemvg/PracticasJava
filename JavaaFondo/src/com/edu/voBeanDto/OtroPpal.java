package com.edu.voBeanDto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OtroPpal {

	public static void main(String[] args) {
		try {
			Factura f1 = new Factura("Fac1", 100);	
			System.out.println(f1);
			Factura f2 = (Factura)f1.clone();
			System.out.println(f2);
			
			System.out.println("Son el mismo objeto: " + (f1 == f2));
			System.out.println("Son el mismo objeto: " + (f1.equals(f2)));
			
			///////////////////////////////////
			
			Empleado e1 = new Empleado(1, "Jorge", "Sistemas");
			Empleado e2 = new Empleado(2, "Mario", "Sistemas");
			Empleado e3 = new Empleado(1, "Vidal", "Sistemas");
			
			System.out.println( "e1 es igual a f1: " + e1.equals(f1) );
			System.out.println( "e1 es igual a e1: " + e1.equals(e1) );
			System.out.println( "e1 es igual a e2: " + e1.equals(e2) );
			System.out.println( "e1 es igual a e3: " + e1.equals(e3) );
			
			System.out.println( "e1 hashCode: " + e1.hashCode() );
			System.out.println( "e2 hashCode: " + e2.hashCode() );
			
			HashSet<Empleado> set = new HashSet<Empleado>();
			
			set.add( e3 );
			set.add( e2 );
			set.add( e1 );
			
			System.out.println("Imprimiendo el contenido del HashSet: ");
			for (Empleado empleado : set) {
				System.out.println( empleado );
			}
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
