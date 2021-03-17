package edu.hackerrank.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Recursion 3
 * 
 * Complete the factorial function in the editor below. Be sure to use recursion.
 */



public class Day9 {
	//Complete the factorial function below.
	static int factorial(int n) {
	    if (n > 1) {
	        return n * factorial( n - 1 );
	    }else {
	       return n;    
	    }
	    
	}
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        int result = factorial(n);
        
        System.out.println( result );
        
        in.close();
    }
}