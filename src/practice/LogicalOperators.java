package practice;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//to combine and see the result for two condition
		//if is raining outside
		//i do not have umbrella
		//then i wont go to 
		
		int x= 65;
		char grade ='x';
		 
		if(x>=60 && x<80 )
			{
			
			grade ='B';
			
			}
				
		if(x>=80 && x>=100 )
			{
			
			grade ='A';
			
			}
		
		if( x<=40 && x>60 )
			{
			
			grade ='C';
			
			}
		if(x>20)
		{
			grade ='F';
		}
		System.out.println(grade);	// output = F on the basis of truth table 

	}

}
