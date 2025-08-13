package practice;

public class PrimeNumberLoop1 
{
	
	public static void main(String[] args) 
	{
		
int limit = 10; // find prime numbers up to this limit
        
        for (int num = 2; num <= limit; num++) 
        {
            boolean P = true;
            
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) //if (num%i == 0) in Java checks whether num is exactly divisible by i meaning the remainder after division is zero.
                {
                    P = false;
                    break;
                }
            }
            
            if (P) 
            {
                System.out.println(num + " is a prime number");
            }
        }   
        
	}

}
