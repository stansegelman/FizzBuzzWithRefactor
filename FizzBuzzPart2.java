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
//Refactor
public class FizzBuzzPart2 extends FizzBuzzPart1 {
    
    private int n;
    @Override  //Overriding the previous method so it still mantains previous functionalities
    public void printFizzBuzz()
    {
        for( n = 1; n <= 100; n++ ){
	String ns = Integer.toString(n);
	if(ns.indexOf("3") > -1 && ns.indexOf("5") > -1 ){ // for 35 and 53
            System.out.println("Input: " + n + " Ouput: fizzbuzz");
        }
        else if ( ns.indexOf("3") > -1 ) {
	  System.out.println("Input: " + n + " Output: fizz");
	  
	}
	else if ( ns.indexOf("5") > -1 ){
	  System.out.println("Input: " + n + " Output: buzz");
	}
        else { 
            System.out.println("Input: " + n);
        }
    }
}
}
