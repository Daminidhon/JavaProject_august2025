package practice;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		boolean itsRaining=true;
		
		if(itsRaining==true)
		{
		System.out.println("i will skip class..");
		}
		
		
		System.out.println("enter two numbers--");
		
		Scanner sc = new Scanner (System. in);
		
		int a = sc.nextInt();
		int b = sc.nextInt ();
		
		if(a>b)
		{
		System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		sc.close();
	}

}
