package Variableanddatatype;

import functions.AccessModifiers;

public class TestAccessModifiersatprojectlevel extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers ref= new AccessModifiers();
		
		ref.publicfunction();
		
	//Protected members can be accessed through out the project using the child class
	
		TestAccessModifiersatprojectlevel obj = new TestAccessModifiersatprojectlevel();
		obj.protectedfunction();
		
		
	}

}
