package edu.hackerrank.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given a string, S , of length N that is indexed from 0  to N - 1, 
 * print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
 */

public class Day6 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int T = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		List<String> strings = new ArrayList<String>();
		if (T >= 1 && T <= 10) {
			for (int i = 1; i <= T; i++) {
				String S = scanner.nextLine();
				if ( S.length() >= 2 && S.length() <= 10000 ) {
					strings.add(S);
				}
			}	
		}
		
		for ( String S: strings ) {
			String odd = "";
			String even = "";
			for (int i = 0; i < S.length(); i++) {
				if ( i % 2 == 0 ) {
					even += S.substring(i, i+1);
				} else {
					odd += S.substring(i, i+1);
				}
			}
			System.out.println(even + " " + odd);
		}
		
		scanner.close();
	}
}