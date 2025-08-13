package practice;

import java.util.Scanner;

public class LoopsDemo1
{

	public static void main(String[] args)
	{
		    //start;      condition;    increment/decrement;
		for(int h=1;       h<=10;       h++)
		{
			System.out.println("Hello" +h);
			
		}
		System.out.println("Enter a nubme to get its table=");
		Scanner sc= new Scanner (System.in);
		
		int n=sc.nextInt();
		
		for(int h=1;       h<=10;       h++)
		{
			int x;
			x= n*h;
			
			System.out.println(x);
		}
		System.out.println("End of the program..");

	}

}
