package practice;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
		
		int a; float c=0.0f; int b=0;
		System.out.println("Enter a number?");
		
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
		if (a>100)
		
		{
			c=a/2.0f;
			b=a/2;
		}
		else {
			b=a*3;
			c=a*3;
		}
		System.out.println(c);
		System.out.println(b);


	}

}
