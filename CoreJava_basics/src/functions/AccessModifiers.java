package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AccessModifiers obj= new AccessModifiers();
		obj.privatefunction();
		obj.publicfunction();
		obj.protectedfunction();
		obj.noAccessModifiers();

	}
      
	public void publicfunction()
	{
		System.out.println("PublicFunction");
		
	}
	
	private void privatefunction()
	{
		System.out.println("Private function");
	}
	
	void noAccessModifiers() //Default access modifier
	{
		System.out.println("No Access Modifiers"); 
		
	}
	
	//Protected members can be accessed through out the project using the child class
	
	protected void protectedfunction()
	{
		System.out.println("Protected function");
	}
	
}
