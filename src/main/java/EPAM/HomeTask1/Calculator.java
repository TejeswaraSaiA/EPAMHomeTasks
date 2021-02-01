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
				+ "Addition (a+b) - 1\n"
				+ "Subtraction (a-b) - 2\n"
				+ "Multiplication (a*b) - 3\n"
				+ "Division (a/b) - 4");
		int operation = scan.nextInt();
		System.out.println(operation);
		Operation Op = new Operation();
		int output = Op.PerformOperation(a, b, operation);
		if(output == -2)
		{
			System.out.println("Enter Valid Operations");
		}
		else
		{
			System.out.println("Result of the Desired Operation on the Provided Numbers is"+output);
		}
		
		scan.close();
		
	}

}
