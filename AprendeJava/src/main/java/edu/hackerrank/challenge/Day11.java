package edu.hackerrank.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/*
 * 2D Arrays
 * 
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum
 */

public class Day11 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		int[][] arr = new int[6][6];

		//Con esto llenamos la matriz pero para pruebas que pereza llenarlo
//		for (int i = 0; i < 6; i++) {
//			String[] arrRowItems = scanner.nextLine().split(" ");
//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//			for (int j = 0; j < 6; j++) {
//				int arrItem = Integer.parseInt(arrRowItems[j]);
//				arr[i][j] = arrItem;
//			}
//		}
		
		System.out.println(-1 > -5);
		
//		int[][] arr = {
//				{1,1,1,0,0,1},
//				{0,1,0,0,3,0},
//				{1,1,1,6,0,4},
//				{9,2,2,4,4,1},
//				{1,9,1,2,0,0},
//				{9,4,1,2,4,0}};
		int[][] arr = {
		{-1, -1, 0, -9, -2, -2},
		{-2, -1, -6, -8, -2, -5},
		{-1, -1, -1, -2, -3, -4},
		{-1, -9, -2, -4, -4, -5},
		{-7, -3, -3, -2, -9, -9},
		{-1, -3, -1, -2, -4, -5}};

		int sum, sumMax = 0;
		for (int i = 0; i < 6; i++) {		
			if (i > 3) break;
			for (int j = 0; j < 6; j++) {
				if ( j > 3  ) break;
				if ( arr[i][j] >= -9 && arr[i][j] <= 9) {
					sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]+arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
					if ( (i==0 && j==0) || sum > sumMax) {
						sumMax = sum;
					}
				}
			}
		}
		
		System.out.println(sumMax);
		
		scanner.close();
	}
}