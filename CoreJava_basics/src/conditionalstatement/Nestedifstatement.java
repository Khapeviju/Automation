package conditionalstatement;

public class Nestedifstatement {
public static void main(String[] args) {
	
	
	///Test case 1
	//1. Launch browser -- Failed (then next steps will not be launched)
	//2. Google URL
	//3. Verify the google logo
	
	///Test case 2
			// Verify gmail is present --Failed
			// Navigate -Verify images link is present (can be tested)
			//Verify user Google logo is present
			

						boolean step1=true;
						boolean step2=true;
						boolean step3=false;

						if(step1)
						{
							System.out.println("step 1 is passed");
							
						if(step2)
						{
							System.out.println("step 2 is passed");
							
							if(step3)
							{
								System.out.println("step 3 is passed");
								
							}else {
								System.out.println("step 3 is failed");
								
							}
							
						}else {
							System.out.println("step 2 is failed");
							
							
						}
						}else {
							System.out.println("step 1 is failed");
						}

}
	
}