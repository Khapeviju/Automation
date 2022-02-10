package conditionalstatement;

public class Conditionalstatement2 {
	public static void main(String[] args) {
	 
	///Test case 1
		//1. Launch browser -- Failed (then next steps will not be launched)
		//2. Google URL
		//3. Verify the google logo
		
	///Test case 2
		// Verify gmail is present --Failed
		//Verify images link is present (can be tested)
		//Verify user icon is present
		
		boolean step1=false;
		boolean step2=false;
		boolean step3=false;
		
		//Step1
		
		if(step1)
		{
			System.out.println("Test step1 is passed");
			
		}
		else {
			
				System.out.println("Test step1 is failed");	
		}
		//step2
		if (step2)
		{
			System.out.println("Test step2 is passed");
            
		}
		else {
			System.out.println("Test step2 is failed");	
			
		}
		//step3
		if (step3)
		{
			System.out.println("Test step3 is passed");
		}
		else 
		{
			System.out.println("Test step3 is failed");	
		}
		
	}

}
