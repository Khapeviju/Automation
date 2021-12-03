package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Telephone;;

public class DynamicPolymrophism {
	
//You can use reference of your parent class for the object of your child class
// In this scenario you can  call only those functions which are present in your parent class
//In this scenario your overridden Methods will get call from your child class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telephone mobile = new Mobile();
//      Reference       same class reference // 
		
	
		mobile.calling();
	//	mobile.texting();
		
//We need to achieve inheritance
//we need to have two minimum one overridden method in child class
//we must have reference of parent class for the object of the child class
//we must call an overridden method using the refernce the parent class
		
		
	}

}
