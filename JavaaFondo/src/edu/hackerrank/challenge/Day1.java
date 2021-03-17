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
        System.out.println(iVar + i);
        
        /* Print the sum of the double variables on a new line. */
		System.out.println(dVar + d);
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + sVar);
        
        scan.close();
    }

}
