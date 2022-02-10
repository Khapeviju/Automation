package exceptionhandling;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
		System.out.println(10/2);
			
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		} finally {
			
			//close all the db connections
			System.out.println("close all the db connectios");      // CLose all the db connections
			
			                                                        //System.out.println("close all the db connections");
		}
	}

}
