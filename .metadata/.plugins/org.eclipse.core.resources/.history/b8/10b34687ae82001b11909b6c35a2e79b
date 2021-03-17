package com.edu;

import java.time.Duration;
import java.time.Month;
import java.util.concurrent.TimeUnit;

//enum con un atributo, y metodo toString sobrescrito
enum Season{
	SPRING(42), SUMMER(67), AUTUMN(32), WINTER(20);
	
	//Se pueden crear propiedades a un enum !!
	private int temperature;
	
	Season(int temp){
		this.temperature = temp;
	}
	
	//En un enum, se puede sobrescribir el metodo toString 
	public String toString() {
		//recuperar carater de un string con charAt
        return this.name().charAt(0) + 
               this.name().substring(1).toLowerCase();
    }

	public int getTemperature() {
		return temperature;
	}
}

//enum sencillo
enum coloresBanderaColombia{
	AMARILLO, AZUL, ROJO
}

public class ClaseEnum {
	
	public static void metodo () {
		Season season = Season.SPRING;
		
		for( Season s : Season.values() ) {
			System.out.print( s +"=>"+ s.getTemperature() + "," );
		}

		System.out.println();
		System.out.println( "name: " + season.name() );
		
		System.out.println( "static: " + Season.SUMMER );
		
		System.out.println( "ordinal: " + season.ordinal() );
		
		System.out.println( "toString: " + season.toString() );
		
	}
	
	public static void main ( String[] args ) {
		
		metodo();
		
		//java.time.Month es una clase enum
		Month m = Month.APRIL;
		System.out.println( "Primer dia del año de " + m.name() + " "+ m.firstDayOfYear(false) );
		System.out.println( "Numero de dias de " + m.name() + " " + m.maxLength() );
		
		TimeUnit t = TimeUnit.DAYS;
		System.out.println( "Numero de horas de 2 dias " + t.toHours(2) );
		
	}
	
}
