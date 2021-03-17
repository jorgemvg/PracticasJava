package com.edu.ordenar.busqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
 * Clase que tiene metodos para ordenar y buscar Objetos en arrays, dependiendo de un criterio de comparacion.
 * Los ordenamientos y busquedas estan hechos a mano. Es decir, se podria usar stream de java8 y no habria que hacer todo a mano. ¡Es mas eficiente con stream()!
 */
public class Util {

	public static void ordenar(Object arr[], Criterio cr) {
		boolean ordenado = false;
		while (!ordenado) {
			ordenado = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (cr.comparar(arr[i + 1], arr[i]) < 0) {
					Object aux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = aux;
					ordenado = false;
				}
			}
		}
	}

	public static void quicksort(Object a[], Criterio cr) {
		quicksort(a, 0, a.length - 1, cr);
	}

	private static void quicksort(Object a[], int primero, int ultimo, Criterio cr) {
		int i, j, central;
		Object pivote;
		central = (primero + ultimo) / 2;
		pivote = a[central];
		i = primero;
		j = ultimo;
		do {
			while (cr.comparar( a[i] , pivote) < 0)
				i++;
			while (cr.comparar( a[j] , pivote ) > 0)
				j--;
			if (i <= j) {
				intercambiar(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j)
			quicksort(a, primero, j, cr); // mismo proceso con sublista izqda
		if (i < ultimo)
			quicksort(a, i, ultimo, cr); // mismo proceso con sublista drcha
	}

	public static void intercambiar(Object[] a, int i, int j) {
		Object aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static Object busquedaLineal( Object[] arr, Object o, Criterio cr) {
	
		Object found = null;
		for (int i = 0; i < arr.length; i++) {
			if ( cr.comparar(arr[i], o) == 0  ) {
				found = arr[i];
				break;
			}
		}
		return found;
	}
	
	public static Object busquedaBinaria(Object[] arr, Object o, Criterio cr) {
	    
		  int size = arr.length;  // Número de elementos
		  int middle = size/2;        // Mitad del array
		    
		  //System.out.println("Size: " + size);
		  //System.out.println("Middle: " + middle);
		  //System.out.println("Array: " + Arrays.toString(arr));
		    
		  if ( cr.comparar(arr[middle], o) == 0 )
		    return arr[middle];
		  else if (size == 1)
		    return null;
		  else if (cr.comparar(arr[middle], o) > 0 )
		    return busquedaBinaria(Arrays.copyOfRange(arr,0,middle),o, cr);
		  else
		    return busquedaBinaria(Arrays.copyOfRange(arr,middle+1,size),o, cr);    
	}
	
	public static Object[] put ( Object[] arr, Object o, Criterio cr ) {
		
		int index = encontrarIndice(arr, o, cr);
		System.out.println("Se encontro el objeto indice: " + index);
		
		if ( index != -1 ) {
			System.out.println("Se encontro el objeto: " + arr[index]);
			//si lo encontro entonces remplazo el objeto en el indice indicado
			arr[index] = o;
			return arr;
		} else {
			//convertimos el array a List para agregar el nuevo objeto
			List lista = new LinkedList<Object>( Arrays.asList(arr));
			lista.add(o);
			Object arr2[] = new Object[lista.size()];
			arr2 = lista.toArray();
			
			//luego de insertar el objeto volvemos a ordenar el array
			quicksort(arr2, cr);
			return arr2;	
		}
		

	}
	
	public static int encontrarIndice (Object[] arr, Object o, Criterio cr) {
		return encontrarIndices(arr, o, cr, 0, arr.length);
	}
	
	public static int encontrarIndices (Object[] arr, Object o, Criterio cr, int ini, int fin) {
		int size = fin - ini;
		int res = size/2;        // Mitad del array
		int middle = ini + res; 
		
		if (size == 0)
			return -1;
		else if ( cr.comparar(arr[middle], o) == 0 )
			return middle;   
		else if (cr.comparar(arr[middle], o) > 0 )
		    return encontrarIndices(arr,o, cr, ini, middle);
		else
		    return encontrarIndices(arr,o, cr, middle + 1, arr.length);
	}
	
}