// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Practical 2 Part 2
// Program to count characters of user input string

import javax.swing.JOptionPane;

public class StringLenghtJOptionPane {
	public static void main(String [] args)
	{
		String myWord;
		
		myWord = JOptionPane.showInputDialog(null, "Please input a word:");
		
		// Declaration of variable to store character count, and computation of the count
		
		int n = myWord.length();
		
		JOptionPane.showMessageDialog(null, "There are " + n + " letters in the word " + myWord + ".");
		
		System.exit(0);
		
	}
}
