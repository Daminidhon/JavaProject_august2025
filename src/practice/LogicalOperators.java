package practice;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//to combine and see the result for two condition
		//if is raining outside
		//i do not have umbrella
		//then i wont go to 
		//AND- 
		//OR - if i have a green and white shirt or both then i will go to college
		
		int x= 70;
		char grade ='x'; 
		 
		if(x>=60 && x<80)
			{
			
			grade ='B';  // if x= 70 output = B on the basis of truth table 
			
			}
				
		if(x>=80 && x<=100 )
			{
			
			grade ='A'; // if x= 35 output = F on the basis of truth table 
			
			}
		
		if( x>=40 && x<60 )
			{
			
			grade ='C';  // if x= 35 output = F on the basis of truth table 
			
			}
		if(x<40)
		{
			grade ='F';
		}
		System.out.println(grade);	// if x= 35 output = F on the basis of truth table 
		
		int g=97;
		System.out.println((g%3==0)||(g%5==0)); // 54=true, 50= true, 10= true , 97=false
 
	}

}
