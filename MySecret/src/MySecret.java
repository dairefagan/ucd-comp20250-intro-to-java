// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 4 Practical 1 Part 4
// Program to compare user input name to stored name, if the same ask for a secret,
// if not just greet the user

import javax.swing.JOptionPane;

public class MySecret {
	public static void main(String[] args){
		
		// alt-gr-a to type the a-fada in my name if you are testing this
		String programmerName = "Dáire";
		
		// String initialisation as user input name
		String userName = JOptionPane.showInputDialog(null, "What is your first name?");
		
		// If it is not the stroed name just say hello
		if (!userName.equalsIgnoreCase(programmerName)){
			// System.out.println("not equal to dáire");
			JOptionPane.showMessageDialog(null, "Hello " + userName + ", nice to meet you.");
		}
		
		// If it is the stored name, ask for a secret
		else {
			String secret = (JOptionPane.showInputDialog("Hi " + programmerName + "! Tell me a secret."));
			// System.out.println("the secret is " + secret);	
			
			// This accounts for strings < 20, = 20, and > 20, rather than just < 20 and > 20.
			if (secret.length() < 20){
				JOptionPane.showMessageDialog(null, "That's not much of a secret.");
			}
			else {
				JOptionPane.showMessageDialog(null, "That's a good secret! I'll never tell.");
			}
		}
		System.exit(0);
	}
}
