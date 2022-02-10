package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
		 //Verify Gmail link is present
		int a= 10;
		int b= 0;
		
		System.out.println(a/b);
		
		} catch(Exception e)
		
		{
		  System.out.println(e.getMessage());	
		}
		
		//Verify images link is present
		System.out.println("End of Test Case");
	
	
	
	}
}
