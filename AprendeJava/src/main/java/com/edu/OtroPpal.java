package com.edu;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class OtroPpal {

	public static void main(String[] args) {
		
		HidingProperty c = new HidingProperty();
		
		c.method();
		
		long[] arr = {2323, 232 ,3434};

		long tot = 0;
		for( long a: arr ) {
			tot += a;
		}
		System.out.println(tot);
		
		ClaseImplementaInterfacePrueba cl = new ClaseImplementaInterfacePrueba();

		InterfacePrueba.metodo4();
		
		ClaseHeredaDeAbstractaPrueba clas = new ClaseHeredaDeAbstractaPrueba();
		clas.devolverString();
		
		String[][] array = new String[3][];
		array[0] = new String[3];
		array[1] = new String[4];
		
		int[][] array2 = {{1,2,3,4},{1,2,4,5},{3,4,5}};
		
		for( int[] val : array2 ) {
			for( int valor : val ) {
				System.out.print(valor);
			}
		}
	
	
		System.out.println(array[1][2]);
		
		//test exceptions
		//prueba("casa");
		
		assertTest();
		
		//String
		String nombre  = "   Jorge Mario Vidal Gutierrez   ";
		System.out.println(nombre);
		System.out.println(nombre.strip()); //borra los espacios al ppio y al final
		System.out.println(nombre.stripIndent()); //borra la identacion que tenga el string
		System.out.println(nombre.stripLeading()); //borra los espacion al ppio
		System.out.println(nombre.stripTrailing()); //borra los espacios al final
		
		System.out.println( nombre.matches("[a-z A-Z]+") );
		
		StringBuilder s = new StringBuilder();
		s.append("casa");
		
		String s2 = "Zion";
		
		System.out.println( s2.equals(s) );
		System.out.println( s2.contentEquals(s) );
		
		System.out.println( s2.compareTo("ZeuS") );
		
		System.out.println( s2.codePointAt(0) );
		
		//String.format, usa el java.util.formatter
		String texto = "Hey, %s! Give me %d apples, %nplease!";
		System.out.println( String.format(texto, "Nick", 2) );
		
		//join()
		String newStr1 = String.join(" y ", "abc", "abc");
		System.out.println(newStr1);
		List<String> listaInt = List.of("1","2", "3", "4");
		System.out.println( String.join(",", listaInt) );
		
		//nombre = devolvernull();
		System.out.println( StringUtils.trim(nombre ) );
		System.out.println( StringUtils.trimToNull( "" ) );
		System.out.println( StringUtils.trimToNull( " " ) );
		
		System.out.println( StringUtils.capitalize( StringUtils.lowerCase(nombre.trim()) ));
		System.out.println( StringUtils.isNumeric("23243") );
		System.out.println( StringUtils.rotate(nombre, 10) );
		System.out.println( StringUtils.difference("jorge marios", "jorge s mario vidal") );
		System.out.println( StringUtils.getLevenshteinDistance("jorge marios", "jorge s mario vidal") );
		
		File f = new File("casa.java");
		System.out.println(f.getAbsolutePath()); //C:\Proyectos\PruebasJava\AprendeJava\casa.java
		
		//Esta es la api de FileUtils, para manejar archivos y directorios
		//https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FileUtils.html
		
		//Para manipular IO Streams IOUtils
		//https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/IOUtils.html
		
		System.out.println("ab"+"42".repeat(2)); //ab4242

		
	}

	private static String devolvernull() {
		return null;
	}
	
	//Exceptions
	private static void prueba ( String s ) throws Exception {
		
		try {
			int entero = Integer.valueOf(s);
			System.out.println( entero );
		}catch (Exception e) {
			e.printStackTrace();
			StackTraceElement[] elem = e.getStackTrace();
			for( StackTraceElement elemen : elem ) {
				System.out.println(elemen);
			}
			System.out.println(e.getMessage());
			
			Throwable t = e.getCause();
			
			System.out.println( e.getCause() );
			
		}
	}
	
	//the assert is executed only when the JVM is run with the -ea option	
	private static void assertTest() {
		
		String casa = "casa";
		
		int i = 2;
		
		assert( casa.equals("casa" + 2) );
		
		System.out.println("Finalizo assert");
	}
}
