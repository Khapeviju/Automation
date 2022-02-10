package exceptionhandling;

public class CheckedException {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(10);
		
		//Thread.sleep(2000);
				
		UncheckedException.sleep();
		
		System.out.println(20);
	
	
	}

}
