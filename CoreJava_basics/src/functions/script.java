package functions;

public class script {
	
  public static void main(String[] args) {
	
	  Library.sum(10, 20);
	  
	  Library.print();
	  
	  //calling of the non static function from another class
	  
	  Library ref= new Library();
	  
//reference type     object
	  ref.fun1();
	  
	  String data=ref.printName("vijay");
	  System.out.println(data);
	  
	  AccessModifiers ref2= new AccessModifiers();
	  
	  ref2.publicfunction();
	  ref2.noAccessModifiers();
	  ref2.protectedfunction();
	 
			  
			  
			  
	  
      }

}
