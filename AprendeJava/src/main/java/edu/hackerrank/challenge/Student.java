package edu.hackerrank.challenge;

public class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName,  id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum = 0;
        for( int s: testScores ){
            sum+=s;
        } 
        long prom = sum / testScores.length;
        
        char charProm = 0;
        if ( prom >= 90 && prom <= 100  ) {
        	charProm = 'O';
        } else if( prom >= 80 && prom < 90  ) {
        	charProm = 'E';
        } else if ( prom >= 70 && prom < 80 ) {
        	charProm = 'A';
        } else if ( prom >= 55 && prom < 70 ) {
        	charProm = 'P';
        } else if ( prom >= 40 && prom < 55 ) {
        	charProm = 'D';
        } else if ( prom < 40 ) {
        	charProm = 'T';
        }
        
        return charProm;
    }
}
