package constructor;

public class Car {
	
	//non static Variables defined at class level are known as instance variable 
	String color;
	String model;
	int engine ;
	
	
	// Default values of string variable will always be null
	//For integers its 0
	
	//static variable defined at class levels are known as class variable
	static int wheels;
	
	public void features()
	{
		//Variables defined in a functions are known as local variable
		int a=10;
		
		System.out.println("Car features color:"+color+", Model:"+model+" and engine size:"+engine+", wheels="+wheels);
	
	}
	//constructor initializes the object
	//Default constructor

	public Car()
	{
		
	}
	//Parameterized constructor
	
	public Car (String col, String mod, int eng)
	
	{
		color=col;
		model=mod;
		engine=eng;
		
	}
	
	//constructor overloading: 2 or more Constructors with different parameters
	
}
