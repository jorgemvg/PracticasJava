package edu.hackerrank.challenge;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int iVar;
        double dVar;
        String sVar;
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        iVar = scan.nextInt();
        dVar = scan.nextDouble();
        scan.nextLine();
        sVar = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(sumar(iVar, i));
        
        /* Print the sum of the double variables on a new line. */
		System.out.println(sumar(dVar, d));
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(concatenar(s, sVar));
        
        scan.close();
    }

	public static int sumar(int a, int b) {
		return a + b;
	}
	
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static String concatenar( String a, String b ) {
		return a + b;
	}
	
}
