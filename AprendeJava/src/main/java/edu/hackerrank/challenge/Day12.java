package edu.hackerrank.challenge;

import java.util.Scanner;

/*
 * Inheritance
 * 
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
 * Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student 
 * inherits all the properties of Person.
 * Complete:
 * 
 * A Student class constructor
 * A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average 
 *  (con una tabla de promedios que no pegue aqui pq era una imagen, pero con eso hice el if del metodo calculate)
 * 
 */

public class Day12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );

	}
	
}
