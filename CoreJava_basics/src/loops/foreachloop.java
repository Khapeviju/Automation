package loops;

public class foreachloop {

	public static void main(String[] args) {
		
		
		int[] arr= {10,20,30};
		
		for(int i=0; i<3; i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("**************");
		
		for(int var:arr)                           //enhanced for loop or for each loop
		{
			System.out.println(var);
		} 
	
		

	}

}
