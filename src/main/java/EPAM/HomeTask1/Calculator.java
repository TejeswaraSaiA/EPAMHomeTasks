package EPAM.HomeTask1;

import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers on which you want to perform operations");
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println("Enter the operation that you want to perform on the inputted Numbers\n"
				+ "Addition - 1\n"
				+ "Subtraction - 2\n"
				+ "Multiplication - 3\n"
				+ "Division - 4");
		int operation = scan.nextInt();
		System.out.println(operation);
		
	}

}
