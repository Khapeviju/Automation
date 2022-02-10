package exceptionhandling;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		try {
			//Verify Launch browser
			System.out.println(10/0);
			
			//Verify login
			System.out.println("second step");
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
