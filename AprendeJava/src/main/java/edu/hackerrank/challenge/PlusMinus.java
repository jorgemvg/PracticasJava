package edu.hackerrank.challenge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 * Calculate the fraction of positive, negative and zero values in an array.
 */

public class PlusMinus {

	 // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

    	int cantPositive = 0;
    	int cantNegative = 0;
    	int cantZeros = 0;
    	
    	for( int i: arr ) {
    		if ( i > 0 ) {
    			cantPositive++;
    		} else if ( i < 0 ) {
    			cantNegative++;
    		} else {
    			cantZeros++;
    		}
    	}
    	int nroElements = arr.length;
    	float ratioPositive = cantPositive / (float)nroElements;
    	float ratioNegative = cantNegative /(float) nroElements;
    	float ratioZeros = cantZeros / (float)nroElements;
    	
    	System.out.println( new BigDecimal(ratioPositive).setScale(6, RoundingMode.HALF_UP) );
    	System.out.println( new BigDecimal(ratioNegative).setScale(6, RoundingMode.HALF_UP) );
    	System.out.println( new BigDecimal(ratioZeros).setScale(6, RoundingMode.HALF_UP) );
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
