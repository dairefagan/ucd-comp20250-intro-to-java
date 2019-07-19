// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 3 Tutorial 2 Part 1
// Program to create a BankAccount object in a variable called myFirstAccount
// with an initial balance of 5000, withdraw 200, and output the balance

import javax.swing.JOptionPane;

public class FixedStartingBalanceBankAccount {
	public static void main(String[] args)
	{
		// Class object = new object (alocate memory for)
		BankAccount myFirstAccount = new BankAccount(5000);
		
		myFirstAccount.withdraw(200);
		
		// System.out.println(myFirstAccount.getBalance());
		
		JOptionPane.showMessageDialog(null, "myFirstAccount contains : " + myFirstAccount.getBalance());
		
		System.exit(0);
		
	}
}
