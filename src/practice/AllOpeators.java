package practice;

public class AllOpeators 
{

	public static void main(String[] args) 
	{
		
		        // 1. Arithmetic Operators
		        int a = 10, b = 3;
		        System.out.println("Arithmetic Operators:");
		        System.out.println("Addition (a + b): " + (a + b));
		        System.out.println("Subtraction (a - b): " + (a - b));
		        System.out.println("Multiplication (a * b): " + (a * b));
		        System.out.println("Division (a / b): " + (a / b));
		        System.out.println("Modulus (a % b): " + (a % b));
		        System.out.println();

		        // 2. Relational Operators
		        System.out.println("Relational Operators:");
		        System.out.println("a == b: " + (a == b));
		        System.out.println("a != b: " + (a != b));
		        System.out.println("a > b: " + (a > b));
		        System.out.println("a < b: " + (a < b));
		        System.out.println("a >= b: " + (a >= b));
		        System.out.println("a <= b: " + (a <= b));
		        System.out.println();

		        // 3. Logical Operators
		        boolean x = true, y = false;
		        System.out.println("Logical Operators:");
		        System.out.println("x && y: " + (x && y));
		        System.out.println("x || y: " + (x || y));
		        System.out.println("!x: " + (!x));
		        System.out.println();

		        // 4. Assignment Operators
		        int c = 5;
		        System.out.println("Assignment Operators:");
		        c += 2;
		        System.out.println("c += 2: " + c);
		        c *= 3;
		        System.out.println("c *= 3: " + c);
		        c -= 4;
		        System.out.println("c -= 4: " + c);
		        c /= 2;
		        System.out.println("c /= 2: " + c);
		        c %= 3;
		        System.out.println("c %= 3: " + c);
		        System.out.println();

		        // 5. Unary Operators
		        int d = 5;
		        System.out.println("Unary Operators:");
		        System.out.println("d: " + d);
		        System.out.println("++d: " + (++d));
		        System.out.println("d++: " + (d++));
		        System.out.println("After d++: " + d);
		        System.out.println("--d: " + (--d));
		        System.out.println("-d: " + (-d));
		        System.out.println();

		        // 6. Bitwise Operators
		        int e = 6, f = 3;
		        System.out.println("Bitwise Operators:");
		        System.out.println("e & f: " + (e & f));
		        System.out.println("e | f: " + (e | f));
		        System.out.println("e ^ f: " + (e ^ f));
		        System.out.println("~e: " + (~e));
		        System.out.println("e << 1: " + (e << 1));
		        System.out.println("e >> 1: " + (e >> 1));
		        System.out.println();

		        // 7. Ternary Operator
		        int max = (a > b) ? a : b;
		        System.out.println("Ternary Operator:");
		        System.out.println("Max of a and b: " + max);
		        System.out.println();

		        // 8. instance of Operator
		        String str = "Hello";
		        System.out.println("instanceof Operator:");
		        System.out.println("str instanceof String: " + (str instanceof String));
	

	}

}
