package edu.hackerrank.challenge;

import java.util.Scanner;

public class Day3 {

	private static final Scanner scanner = new Scanner(System.in);
	private final static String WEIRD = "Weird";
	private final static String NOT_WEIRD = "Not Weird";
	
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String msg = WEIRD;
        if ( N >= 1 && N <= 100 ) {
        	if ( N % 2 == 0 ) {
        		if ( N >= 2 && N <= 5 ) {
        			msg = NOT_WEIRD;
        		} else if ( N >= 6 && N <= 20 ) {
        			msg = WEIRD;
        		} else if ( N > 20 ) {
        			msg = NOT_WEIRD;
        		}
        	}
        }
        
        System.out.println( msg );

        scanner.close();
    }

}
