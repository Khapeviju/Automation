package oops.polymorphism;

public class StaticPolymorphism {

	 // Function overloading= Static polymorphism
	public static void main(String[] args) {
		
		//10,20,30
		
		StaticPolymorphism obj = new StaticPolymorphism();
		obj.sum(10,20);
		obj.sum(10, 20,30);
		
	}

	public int sum(int a, int b)
	{
		
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	
	{
		return a+b+c;		
	}
}

