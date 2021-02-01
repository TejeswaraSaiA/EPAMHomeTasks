package EPAM.HomeTask1;

public class Operation 
{
	int PerformOperation(int a,int b, int op)
	{
		if(op == 1)
		{
			System.out.println("Performing Addition Operation on "+a+" "+b);
			return a+b;
		}
		else if(op == 2)
		{
			System.out.println("Performing Subtraction Operation on "+a+" "+b);
			if(a>b)
			{
				return a-b;
			}
			return b-a;
		}
		else if(op == 3)
		{
			System.out.println("Performing Multiplication Operation on "+a+" "+b);
			if(a==0 || b==0)
			{
				System.out.println("Multiplication with Zero\n");
			}
			return a*b;
		}
		else if(op == 4)
		{
			System.out.println("Performing Division Operation on "+a+" "+b);
			if(b==0)
			{
				System.out.println("Division by Zero is not Valid");
				return -1;
			}
		}
		return -2;
	}

}
