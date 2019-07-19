// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 4 Tutorial 3 Part 1
// Program to read in words for their user, computer the number of characters, and output the result

import javax.swing.JOptionPane;

public class WordsLength {
	public static void main(String[] args){
		
		// Must be declared here or there will be errors with the do while loop
		int currentCount;
		// Must be intialised here or there will be errors with the do while loop
		int totalCount = 0;
		
		// Loop to run until the user just presses enter
		do {
		
		// Intialise the string each loop iteration as the user input word	
		String word = JOptionPane.showInputDialog(null, "Please enter a word: ");
		
		// Count the number of characters in the current word input and store as integer
		currentCount = word.length();
		
		// Increment the total word character count by the number of characters in the current word
		totalCount += currentCount;
		
		// Do, only while, the current word has 0 characters, i.e just enter was pressed
		} while(currentCount!=0);
		
		// System.out.println("" + totalCount);
		
		JOptionPane.showMessageDialog(null, "The total number of characters in those words is " + totalCount + ".");
		
		System.exit(0);
	}
	
}
