// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 3 Lab 2 Part 2
// Program to compute the volume of a box from user input dimensions

import javax.swing.JOptionPane;

public class BoxVolume {
	public static void main(String [] args)
	{
		String widthInput = JOptionPane.showInputDialog(null, "Enter box width (in metres)");
		// System.out.print(width)
		String lengthInput = JOptionPane.showInputDialog(null, "Enter box length (in metres)");
		String heightInput = JOptionPane.showInputDialog(null, "Enter box height (in metres)");
		
		// Declare and assign double variables with the user input strings, converted to doubles
		
		double width = Double.parseDouble(widthInput);
		double length = Double.parseDouble(lengthInput);
		double height = Double.parseDouble(heightInput);
		
		// Calculate, desclare, and assign volume
		
		double volume = width*length*height;
		
		// System.out.print(volume);
		
		// String output = ("test");
		
		// Could have used %f of 2.%f to call the floats nice rounded to two decimal places,
		// but strings for exact user input instead.
		
		// Generate the string which we will call with JOptionPane afterwards
		
		String output = String.format("A box of width %s metres, length %s metres, and height %s metres, has a volume of %.2f metres cubed.", widthInput, lengthInput, heightInput, volume);
		
		// System.out.print(output);
		
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
		
	}

}
