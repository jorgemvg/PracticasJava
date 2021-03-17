package com.edu;

import java.util.ArrayList;
import java.util.List;

import com.edu.voBeanDto.Empleado;
import com.edu.voBeanDto.Factura;

public class Principal {

	public static void main(String[] args) {

		List<Factura> lista = new ArrayList<Factura>();
		
		Factura f1 = new Factura("Factura1", 1000);
		Factura f2 = new Factura("Factura2", 2000);
		Factura f3 = new Factura("Factura3", 3000);
		Factura f4 = new Factura("Factura4", 4000);
		Factura f5 = new Factura("Factura5", 5000);
		Factura f6 = new Factura("Factura6", 6000);
		
		lista.add(f2);
		lista.add(f5);
		lista.add(f6);
		lista.add(f1);
		lista.add(f4);
		lista.add(f3);
		
		//Usando filter
		Factura facturaFiltro = lista.stream().filter( elemento -> elemento.getImporte() > 3000 )
		.findAny().get();
		
		System.out.println(facturaFiltro);
		
		//Impresion de toda la lista wwoooowww
		lista.stream().forEach( System.out::println );
		
		
		Empleado e1 = new Empleado(1, "Oscar Blancarte", "Systems");
		Empleado e2 = new Empleado(2, "Liliana Castro", "Systems");
		Empleado e3 = new Empleado(3, "Fernanda Martinez", "Systems");
		Empleado e4 = new Empleado(4, "Manuel Lopez", "RH");
		Empleado e5 = new Empleado(5, "Rebeca Perez", "Systems");
		Empleado e6 = new Empleado(6, "Benjamin Osuna", "RH");
		
		List<Empleado> listaEmpleado = new ArrayList<Empleado>();
		
		listaEmpleado.add(e1);
		listaEmpleado.add(e2);
		listaEmpleado.add(e3);
		listaEmpleado.add(e4);
		listaEmpleado.add(e5);
		listaEmpleado.add(e6);
		listaEmpleado.add(e1);
		
		//Imprime los empleados del area de sistemas, ordenados por nombre y elimina repetidos.
		listaEmpleado.stream()
		.filter(x -> x.getDepartment().equals("Systems"))
		.sorted((x,y) -> x.getName().compareToIgnoreCase(y.getName()))
		.distinct()
		.forEach(System.out::println);

		
//		try {
//			Object f44 = (Factura)f1.clone();
//			System.out.println(f44);
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
				
		InterfacePrueba prueba = new ClaseImplementaInterfacePrueba();
		
		prueba.metodo1();
		prueba.metodo2();
		prueba.imprimir();
		String valorAtributoEstaticoDeInterfaz = prueba.atributoUno;
		System.out.println("El valor de la costante de la interfaz es: " + valorAtributoEstaticoDeInterfaz);
		InterfacePrueba.metodo4();
		
		System.out.println( 100 % 2 );
		System.out.println( 99 % 2 );
	}

	 
	
}
