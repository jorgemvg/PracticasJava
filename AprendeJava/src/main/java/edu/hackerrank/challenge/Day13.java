package edu.hackerrank.challenge;

import java.util.Scanner;

/*
 * Abstract Classes
 * 
 * Given a Book class and a Solution class, write a MyBook class that does the following:
 *
 *	Inherits from Book
 *	Has a parameterized constructor taking these  parameters:
 *	string title
 *	string author
 *	int price
 *	Implements the Book class' abstract display() method so it prints these  lines:
 *	Title:, a space, and then the current instance's .
 *	Author:, a space, and then the current instance's .
 *	Price:, a space, and then the current instance's .
 * 
 */

public class Day13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
	
}
