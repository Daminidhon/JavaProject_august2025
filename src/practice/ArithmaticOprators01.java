package practice;

public class ArithmaticOprators01 {
	
	public static void main (String tty[])
	{
		//Arithmetic Operators in Java  (+ - * / %)
		int x,q,w;
		q= 25; w=5;
		
		x= q+w+37;
		System.out.println("Additon="+x);
		
		x= 30-q-w;
		System.out.println("Substraction="+x);
		
		x= q*w+5;
		System.out.println("Multiplication="+x);
		
		x= q/w-2;
		System.out.println("Division="+x);

		x= q%7+39;
		System.out.println("reminder="+x);
		
		x=5-39*w/1+10%3+q;
		System.out.println( "result="+x);
	 
	}
	
}
