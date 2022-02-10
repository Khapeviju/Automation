package functions;

public class Library {
	
	public static int sum(int a, int b) 
	{
		return a+b;
	}
	public static void print()
	{
		System.out.println("Testing static function");
	}
	
	public void fun1() 
	{
		System.out.println("Testing non static function");
		
	}
	
	public String printName(String name)
	{
		return"Your name is  "+name;
		
	}
	
}
