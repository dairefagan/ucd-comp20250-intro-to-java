// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 3 Lab 2 Part 1
// Program to compute the area of a circle from user input radius

// Import the Swing package the JOptionPane class in the Java Extras package so we can work with windows

import javax.swing.JOptionPane;

public class CircleArea {
	public static void main(String [] args)
	{
		// String radiusInput;
		
		String radiusInput = JOptionPane.showInputDialog(null, "Enter circle radius:");
		
		// Declare and assign double variable with the user input string, converted to a double
		
		double radius = Double.parseDouble(radiusInput);
		
		// System.out.println(radius);
		
		double area =  radius*radius*3.1416;
		
		// Convert double to float so the decimal places will be limited to 2
		// I tried using %2.f and $%2.f but this did not work with showMessageDialog
		
		float areaoutput = (float)area;
		
		// System.out.println(area);
		
		JOptionPane.showMessageDialog(null, "Circle of radius " + radius + " has an area of "+ areaoutput);
		
		System.exit(0);
		
	}
}
