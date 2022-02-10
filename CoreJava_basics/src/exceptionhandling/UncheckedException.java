package exceptionhandling;

import oops.abstraction.RBI;

public class UncheckedException {
	
	//Default of class and interface references will always be null
	static RBI bank;

	public static void main(String[] args) {
		
		int a =10;
		int b= 0;
		 
		//System.out.println(a/b);
		
		//bank.creditcard();
		
		String name= "anand";
		
		System.out.println(name.charAt(5));
	}


     public static void sleep() throws InterruptedException
    {
	 Thread.sleep(3000);
    }

}