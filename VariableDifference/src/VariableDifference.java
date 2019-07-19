// Dáire Fagan
// 14749125
// COMP20250 Introduction to JAVA 2016-2017
// Practical 2 Part 4
// Program to compute the sum and product of three numbers, and then output the difference of same

public class VariableDifference {
	public static void main(String [] args)
	{
		double a = 3.1;
		double b = 6.2;
		double c = 7.0;
		
		double sum = a + b + c;
		
		double difference = a*b*c - sum;
		
		/* I know I could have used print or println for each line, negating the need for \n, but
		that would not have allowed me to round the doubles to 2 decimal places */
		
		System.out.println();
		System.out.printf("The variable sum contains the value %.2f.", sum);
		System.out.printf("\nThe variable difference contains the value %.2f.", difference);
		
		System.exit(0);
	}

}
