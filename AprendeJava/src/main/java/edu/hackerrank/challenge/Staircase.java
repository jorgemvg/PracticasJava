package edu.hackerrank.challenge;

import java.util.Scanner;

/*
 * Staircase
 * 
 * Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 * Write a program that prints a staircase of size n.
 */
public class Staircase {

	// Complete the staircase function below.
    static void staircase(int n) {

    	/* Imlementacion para java11 (aqui se creo el repeat)
    	for( int i = 1; i <= n; i++ ) {
    		System.out.println(" ".repeat(n - i) + "#".repeat(i));
    	}
    	 */

    	String salida = "";
    	for( int i = 1; i <= n; i++ ) {
    		for( int j = 0; j < n - i; j++ ) {
    			salida += " "; 
    		}
    		for( int j = 0; j < i; j++ ) {
    			salida += "#";
    		}
    		System.out.println(salida);
    		salida = "";
    	}
    }
    
    private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();

	}

}
