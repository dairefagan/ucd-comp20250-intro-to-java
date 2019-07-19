// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 4 Practical 1 Part 1
// Program to compare two numbers and output results to user in a window

import javax.swing.JOptionPane;

public class CompareTwoNumbers {
	public static void main(String[] args)
		{	
		// Declaration and assignment of 2 ints, which are converted from strings, read in from user with JOptionPane
		// This is much more efficient than creating separate string variables
		
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter first number: "));
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter second number: "));
		
		// System.out.println("Testing " + firstNumber + " " + secondNumber);
		
		// Output the result of the comparison, where one is less than the other, otherwise they must be equal
		
		if (firstNumber < secondNumber){
			JOptionPane.showMessageDialog(null, "The first number " + firstNumber + " is less than the second number " + secondNumber + ".");
			}
		else if (secondNumber < firstNumber){
			JOptionPane.showMessageDialog(null, "The second number " + secondNumber + " is less than the first number " + firstNumber + ".");
			}
		else {
			JOptionPane.showMessageDialog(null, "The two numbers you entered are equal.");
			}
		System.exit(0);			
	}		
}

