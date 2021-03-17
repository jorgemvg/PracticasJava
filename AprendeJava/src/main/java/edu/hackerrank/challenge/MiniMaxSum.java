package edu.hackerrank.challenge;

import java.util.Scanner;

public class MiniMaxSum {

	/*
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
	 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
	 */
	
	private static final Scanner scanner = new Scanner(System.in);

	 // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	long sum = 0;
    	long sumMax = 0;
    	long sumMin = 0;
    	for( int i = 0; i < 5; i++ ) {
    		for( int j = 0; j < 5; j++ ) {
    			if ( j != i ) {
    				sum+=arr[j];
    			}
    		}
    		if(i==0) {
    			sumMax = sum;
    			sumMin = sum;
    		}
    		if (sum > sumMax) {
    			sumMax = sum;
    		} 
    		if( sum < sumMin ) {
    			sumMin = sum;
    		}
    		sum = 0;
    	}

    	System.out.println(sumMin + " " + sumMax);
    }
	
    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
