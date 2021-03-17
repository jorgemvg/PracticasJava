package com.edu;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Pruebas {

	public static void main(String[] args) {
		int i = 234_345_344;
		System.out.println(i);
		
		float f = 3445F;
		System.out.println(f);
		
		double d = 453345f;
		System.out.println(d);
	
		System.out.println('\\');
		
		System.out.println("The back\bspace");

		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		
		System.out.println( fmt.format(3456890) );
		 
		double numero = 1000;
		
		double por = 50;
		
		por %= numero;
		
		System.out.println("Numero porcentaje: " + por);
		
		por += 10;
		
		System.out.println("Numero suma: " + por);
		
		int x = 5;
		
		System.out.println( (x / 2.) );
		
		int j = 3;
		
		int h = j++;
		
		System.out.println(h);
		System.out.println(j);
		
		//literal string goes to the string pool
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println("abc" == s2.intern()); //intern gets s2 to the pool and reuses one with the same value
		
		//raw string literal
		String html = """
				<html>
					<tag>
						asafd
					</tag>
					fdasdfd
					asdfaf
				</html>
				""";
		System.out.println(html);
		
		//se puede usar var desde java10. Y se debe declarar e inicializar en la misma linea.
		var fe = 1;
		
		//iniciar una lista y recorrerla con un for abreviado
		List<String> lista = List.of("s1", "s2", "s3", "s4");
		for(String s:lista) {
			System.out.print(s + " ");
		}
		System.out.println(" ");
		
		//for con un label. Y usamos el label para detener ese primer for.
		List<List<String>> listOfLists = List.of(
			List.of("12", "45", "322", "44", "67"),
			List.of("56", "45", "32", "44", "67")
				);
		
		String found = null;
		exit: for(List<String> l: listOfLists){
		    for (String s: l){
		        System.out.print(s + " ");
		        if(s.contains("3")){
		            found = s;
		            break exit;
		        }
		    }
		}
		System.out.println("Found: " + found);
		
		int x2 = 10;
		x2 = x2 % 6;
		System.out.println(x2);
		
		System.out.println("A".repeat(3).lastIndexOf("A"));
	
		String $;
		
		//Varargs
		someMethod("prueba ", 1, 3,4,5,4,3,2 );
	}
	
	public static void someMethod(String s, int i, double... args) {
		System.out.println(s);
		System.out.println(i);
		for(double h: args) { System.out.print(h + " "); }
	}

}
