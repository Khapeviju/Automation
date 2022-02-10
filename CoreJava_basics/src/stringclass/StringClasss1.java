package stringclass;

public class StringClasss1 {

	public static void main(String[] args) {
		
		String name= "Your application number is 1234";
		
		//Function 1
		System.out.println(name.length());
		
		//Function 2  char at location 2
		System.out.println(name.charAt(2));
		
		//Function 3 
		String name2="Anand";
		
		System.out.println(name.equals(name2));
		
		//Function 4
		
		System.out.println(name.equalsIgnoreCase(name2));
	
		//Function 5
		System.out.println(name.replace("a","1"));
		
		//Function 6
		String[] arr=name.split(" ");
		System.out.println(arr[4]);
		
		
	}

}
