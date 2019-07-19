// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 3 Tutorial 2 Part 2
// Program to take input value from user, create an account double that value,
// withdraw a user input amount, and output the final balance

import  javax.swing.JOptionPane;

public class OptionalStartingBalanceBankAccount {

	public static void main(String[] args) {
		// Declaration, and assignment of String for initial balance from user input value
		String initialBalance = JOptionPane.showInputDialog(null, "Enter initial balance: ");
		
		// Conversion of string into Double 
		Double balance = Double.parseDouble(initialBalance);
		
		// New account twice the value of the user input value
		BankAccount myTestAccount = new BankAccount(balance*2);
		
		// Declaration, and assignment of String to be used to withdraw from user input value
		String withdrawl = JOptionPane.showInputDialog(null, "Enter amount to withdraw: ");
		
		// Conversion of string into Double 
		Double withdrawlConverted = Double.parseDouble(withdrawl);
		
		//The withdraw method is used
		myTestAccount.withdraw(withdrawlConverted);
		
		//Output final balance to user
		JOptionPane.showMessageDialog(null, "After the withdrawl, myTestAccount contains: " + myTestAccount.getBalance());

		System.exit(0);
	}
}
