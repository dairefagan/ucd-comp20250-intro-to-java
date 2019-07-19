// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Week 4 Practical 1 Part 3
// Program to compute the area of user selected shape, output same, or output shape unrecognised

import javax.swing.JOptionPane;

public class CircleRectangleTriangle {
	public static void main(String[] args)
		{
		
		// Intialisation of String as user input choice
		String choice = JOptionPane.showInputDialog(null, "Do you want to work out the area of a circle, rectangle, or triangle?");
			
		if (choice.equals("circle")){
			
			// Initialisation of radius as user input value
			double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a radius value:"));
			// System.out.println(radius);
			
			// Accounting for erroneous values input by user
			if (radius < 0){
				JOptionPane.showMessageDialog(null, "Radius value less than zero: cannot compute circle area.");
			}
			
			// Otherwise compute area and output. More efficient to compute area as part of the JOptionPane 
			// statement rather than separately storing it in a variable
			else {
				JOptionPane.showMessageDialog(null, "A circle of radius " + radius + " has an area of " + radius*radius*3.1416);
			}
		}
		else if (choice.equals("rectangle")){
			
			// Initialisation of variables to store shape dimensions as user input values
			double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width of the rectangle:"));
			double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the rectangle:"));
			
			// Accounting for errornoues values input by user
			if (width == 0 || length == 0){
				JOptionPane.showMessageDialog(null, "Side less than zero: cannot compute rectangle area.");
			}
			
			// Otherwise compute area and output
			else {
				JOptionPane.showMessageDialog(null, "A rectangle of sides " + width + " and " + length + " has an area of " + width*length + ".");
			}
		}
		else if (choice.equals("triangle")){
			
			// Initialisation of variables to store shape dimensions as user input values
			double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width of the base of the triangle:"));
			double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the perpendicular height of the triangle:"));
			
			// Accounting for erroneous values input by user
			if (base == 0 || height == 0){
				JOptionPane.showMessageDialog(null, "Value less than zero: cannot compute triangle area.");
			}
			
			// Otherwise compute area and output
			else {
				JOptionPane.showMessageDialog(null, "A triangle of base width " + base + " and perpendicular height " + height + " has an area of " + 0.5*base*height + ".");
			}
		}
		
		// Accounting for user input other than shapes the program will recognise
		else {
			JOptionPane.showMessageDialog(null, " I don't recognise the shape " + choice + ": cannot work out the area.");
		}
		System.exit(0);
	}
}
