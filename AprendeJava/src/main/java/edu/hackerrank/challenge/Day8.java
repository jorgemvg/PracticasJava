package edu.hackerrank.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Dictionaries and Maps
 * 
 * Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. For each name queried, 
 * print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.
 */

public class Day8 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
        	// Write code here
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if ( map.containsKey(s) ) {
            	System.out.println(s + "=" + map.get(s));
            } else {
            	System.out.println("Not found");
            }
            
        }
        in.close();
    }
}