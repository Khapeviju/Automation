package constructor;

public class Methodoverloading {

	//adding 2 or more methods with same name and but different objects is called method overloading.
	public static void main(String[] args) {
		
	sum(10,20);
	
	sum(10,20,30);
	
	//10,20,30
		
	}
	
	public static void sum(int a , int b)
	
	{
		System.out.println(a+b);
		
	}
    public static void sum(int a , int b, int c)
	
	{
		System.out.println(a+b+c);
		
	}
}
