package edu.hackerrank.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/*
 * Binary Numbers
 * 
 * Given a base-10 integer, n, convert it to binary (base-2). 
 * Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. 
 * When working with different bases, it is common to show the base as a subscript.
 */

public class Day10 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String binario = Integer.toBinaryString(n);

		System.out.println(binario);

		int count1 = 0;
		int count1Max = 0;
		for (int i = 0; i < binario.length(); i++) {
			char b = binario.charAt(i);
			if (b == '1') {
				count1++;
			} else {
				if (count1 > count1Max) {
					count1Max = count1;
				}
				count1 = 0;
			}
		}

		if (count1 > count1Max) {
			count1Max = count1;
		}

		System.out.println(count1Max);

		scanner.close();
	}
}