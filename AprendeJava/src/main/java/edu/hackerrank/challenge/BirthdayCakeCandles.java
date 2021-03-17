package edu.hackerrank.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

	/*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    	// Write your code here
    	
    	Collections.sort(candles);
    	int maxCandle = candles.get(candles.size() - 1);
    	int count = 0;
    	for( int i = candles.size() -1; i >= 0; i-- ) {
    		if ( candles.get(i) == maxCandle) {
    			count++;
    		} else {
    			break;
    		}
    	}

    	return count;
    }
	
	public static void main(String[] args) {
		
		List<Integer> candles = Arrays.asList(3, 5, 1, 5, 2, 3, 4, 5, 3);
		
		int result = birthdayCakeCandles(candles);
		
		System.out.println(result);
	}

}
