package exceptionhandling;

import oops.abstraction.RBI;

public class MultipleCatchBlocks {
	
	// throw: to throw an exception explicitly
	
	static RBI rbi;
	
	public static void main(String[] args) {
		
	//	throw new ArithmeticException();
		
		
		try {
		
		//Verify Launch browser
		System.out.println(10/1);
		
		//Verify login
		String str="anand";
		System.out.println(str.charAt(0));
		System.out.println("second step");
		
		//Third step
	
		rbi.creditcard();
		
		
	    }catch(ArithmeticException e)
		{
		
		System.out.println("Arithmetic exception:"+e.getMessage());
		
		}
		catch(StringIndexOutOfBoundsException e)
		{
		
		System.out.println("There is no such index:"+e.getMessage());
		
		}
		catch(Exception e)
		{
		
		System.out.println("Common exception:"+e.getMessage());
		
		}
		
		/*{
			throw e;
		}
*/
    }
}
