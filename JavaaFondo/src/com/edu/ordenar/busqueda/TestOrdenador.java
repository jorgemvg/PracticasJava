package com.edu.ordenar.busqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOrdenador {

	public static void main(String[] args) {

		try {

			//A pesar de que estos ejercicios usan array, seria mas sencillo usar siempre List.
			
			List<Alumno> lista = crearLista();

			Alumno arr[] = convertFromListToArray(lista);

			odernarArray(arr);

			encontrarAlumnoByNombre(arr, "Nombre999");

			Alumno nuevoAlumno = new Alumno("Nombres999", 25, 3.5);
			
			Object[] o = Util.put(arr, nuevoAlumno, new CriterioAlumnoNombre());
			
			encontrarAlumnoByNombre(o, "Nombres999");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static List<Alumno> crearLista() throws Exception{
		
		//		Alumno arr[] = {
		//		new Alumno("Albero", 50, 5.0),
		//		new Alumno("Jorge Mario", 38, 5.0),
		//		new Alumno("Carlos Albero", 30, 3.0),
		//		new Alumno("Alejandra Sepulveda", 35, 4.9),
		//		new Alumno("Ernesto Valdez", 43, 2.7),
		//		new Alumno("Ernesto Valdez", 43, 4.5),
		//		new Alumno("Ernesto Valdez", 43, 4.8),
		//		new Alumno("Ernesto Valdez", 43, 1.5),
		//		new Alumno("Ernesto Valdez", 43, 4.5),
		//		new Alumno("Ernesto Valdez", 43, 2.5),
		//		new Alumno("Ernesto Valdez", 43, 4.5),
		//		new Alumno("Ernesto Valdez", 43, 3.3),
		//		new Alumno("Ernesto Valdez", 43, 4.5),
		//		new Alumno("Ernesto Valdez", 43, 1.9),
		//};
		
		List<Alumno> lista = new ArrayList<Alumno>();
		for (int i = 0; i < 100000; i++) {
			lista.add(new Alumno());
		}
		lista.add(new Alumno("Nombre999", 38, 5.0));
	
		return lista;
	}
	
	private static Alumno[] convertFromListToArray(List<Alumno> lista) {
		Alumno arr[] = new Alumno[lista.size()];
		return lista.toArray(arr);
	}
	
	private static void odernarArray( Alumno[] arr ) {
		long start = System.currentTimeMillis();

		// Util.ordenar(arr, new CriterioAlumnoNotaProm());
		Util.quicksort(arr, new CriterioAlumnoNombre());

		long end = System.currentTimeMillis();

		double tot = end - start;

		System.out.println( "Tiempo ordenando la lista: " + tot);
	}
	
	private static Alumno encontrarAlumnoByNombre(Object[] arr, String nombre) {
		// Probar encontrar un alumno
		long startEncontrar = System.currentTimeMillis();
		
		// Object o = Util.busquedaLineal(arr, new Alumno("Nombre999", 2, 2), new CriterioAlumnoNombre());
		//Object o = Util.busquedaBinaria(arr, new Alumno(nombre, 2, 2), new CriterioAlumnoNombre());
		
		//Aunque usando stream, no es necesario tener ordenada la lista (pq aqui ya nos esta llegando ordenada, pero no es necesario)
		List<Object> lista = Arrays.asList(arr);
		Optional<Object> optional = lista.stream().filter(x -> ((Alumno)x).getNombre().equals( nombre )).findFirst();
		Alumno o = (Alumno)optional.get();
		
		long endEncontrar = System.currentTimeMillis();

		double totEnc = endEncontrar - startEncontrar;

		System.out.println("Tiempo para encontrar elemento: " + totEnc);
		System.out.println(o);
		
		return o;
	}
	
}