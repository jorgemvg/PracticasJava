package com.edu;

public class MaximumValues {

	public static void main(String[] args) {

		//valores maximos de tipos primitivos
		System.out.println( "byte: " + Byte.MAX_VALUE );
		System.out.println( "short: " + Short.MAX_VALUE );
		System.out.println( "char: " + Character.MAX_VALUE );
		System.out.println( "int: " + Integer.MAX_VALUE );
		System.out.println( "long: " + Long.MAX_VALUE );
		System.out.println( "float: " + Float.MAX_VALUE );
		System.out.println( "double: " + Double.MAX_VALUE );
		
		//Widening Conversion
		int i = 2147483647;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println(d);
		
		//Narrowing Conversion
		double d2 = 984933933903D;
		//float f2 = d2; //error
		float f2 = (float)d2;
		long l2 = (long)f2;
		int i2 = (int)l2;

		System.out.println(i2);
		
	}
	
	 void metodo1() {
		System.out.println("metodo1");
	}
	
	void metodo1(String s) {
		System.out.println("metodo1");
	}

}
