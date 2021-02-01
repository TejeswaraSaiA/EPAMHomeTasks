package EPAM.HomeTask1;

import java.util.Scanner;
public class Calculator 
{
	public static void Add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void Divide(int a,int b)
	{
		if(b==0)
		{
			System.out.println("Divide With Zero");
		}
		else
		{
			System.out.println(a/b);
		}
	}
	public static void Multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void Subtract(int a, int b)
	{
		System.out.println(a-b);
	}
	
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
		int op = scan.nextInt();
		System.out.println(op);
		
			if(op == 1)
			{
				System.out.println("Performing Addition Operation on "+a+" "+b);
				Add(a,b);
			}
			else if(op == 2)
			{
				System.out.println("Performing Subtraction Operation on "+a+" "+b);
				if(a>=b)
				{
					Subtract(a,b);
				}
				else
				{
					Subtract(b,a);
				}
			
			}
			else if(op == 3)
			{
				System.out.println("Performing Multiplication Operation on "+a+" "+b);
				Multiply(a,b);
			
			}
			else if(op == 4)
			{
				System.out.println("Performing Division Operation on "+a+" "+b);
				Divide(a,b);
			}
		scan.close();
		
	}

}
