// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Practical 2 Part 1
// Program to request input and display output in popups

// Call for Java Extras package swing, which allows us to work with windows

import javax.swing.JOptionPane;

public class WelcomeJOptionPane {
	public static void main(String[] args)
	{
		String name;
		
		// Class and method to request user input and assign to the string name
		// The null argument is because we are not doing anything with frames
		
		name = JOptionPane.showInputDialog(null, "What's your name?");

		// Class and method to display greeting and the string name
		
		JOptionPane.showMessageDialog(null, "Hello, " + name);
		
		// Message to OS that the program has completed without error
		
		System.exit(0);
	}

}
