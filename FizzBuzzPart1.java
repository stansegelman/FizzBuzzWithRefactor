/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzzproject;

/**
 *
 * @author stan
 */
public class FizzBuzzPart1 {
    
    private int n;
    public void printFizzBuzz() {
    for( n = 1; n <= 100; n++ ){
	if( n % 3 == 0 && n % 5 == 0 ) {
	  System.out.println("Input: " + n + " Output: fizzbuzz"); 
        }
	else if (n % 3 == 0){
	  System.out.println("Input: " + n + " Output: fizz");
	}
	else if (n % 5 == 0){
	  System.out.println("Input: " + n + " Output: buzz");
	}
	else { 
	  System.out.println("Input: " + n);}
	
	}
    }
}
