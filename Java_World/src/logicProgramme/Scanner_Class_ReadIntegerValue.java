package logicProgramme;

import java.util.Scanner;

public class Scanner_Class_ReadIntegerValue {
	
	
// read the number from standard input 

	public static void main(String[] args) {
		int num;
		// print the message to ask the user to enter number
		System.out.println("Enter the integer: ");
		
		// Scanner class import from utility package.
		//create Scanner object. 
		Scanner  s = new Scanner(System.in);
		//create scanner object s ,to take input from keyboard (System.in)
		
		//read the input form the user and store it  in num.
		num = s.nextInt();
	   
		System.out.println("Entered interger is: "+ num);
		
		// closes the scanner to free up the resourse.
		s.close();
		

	}
 
}
