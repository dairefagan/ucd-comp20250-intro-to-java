// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 4 Practical 1 Part 2
// Program to see if one user input number is a factor of another, and output the power and any remainder.

import javax.swing.JOptionPane;

public class Factors {
	public static void main(String[] args)
		{	
		// Declaration and assignment of 2 ints, which are converted from strings, read in from user with JOptionPane
		// This is much more efficient than creating separate string variables
		
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter first number: "));
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter second number: "));
		
		// Declaration of ints to hold lower and higher numbers.
		
		int lowerNumber;
		int higherNumber;
		
		if (firstNumber < secondNumber){
			lowerNumber = firstNumber;
			higherNumber = secondNumber;
			}
		else {
			lowerNumber = secondNumber;
			higherNumber = firstNumber;
			}
		
		// Declaration to hold power and remainder values, initialising them here saves duplicating them in if statements later.
		
		int power = higherNumber/lowerNumber;
		int remainder = higherNumber % lowerNumber;
		 
		// System.out.println("First number is: " + firstNumber + " and the second number is: " + secondNumber + " The lower number is: " + lowerNumber + " The higher number is: " + higherNumber);
		
		if (remainder == 0){
			// int power = higherNumber/lowerNumber;
			JOptionPane.showMessageDialog(null, lowerNumber + " is a factor of " + higherNumber + " (" + lowerNumber + " goes into " + higherNumber + " exactly " + power + " times)"); 
		}
		else {
			// int power = higherNumber/lowerNumber;
			// int remainder = higherNumber/lowerNumber;
			JOptionPane.showMessageDialog(null, lowerNumber + " is not a factor of " + higherNumber + " (" + lowerNumber + " goes into " + higherNumber + " a total of " + power + " times, with " + remainder + " over).");
		}
		System.exit(0);
	}
}
