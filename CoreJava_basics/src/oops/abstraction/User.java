package oops.abstraction;

public class User {

	//1. You can't create object of your abstract class
	public static void main(String[] args) {
		
		MSWord word= new Sprint3();
		
		word.convert();
		word.font();
		word.table();
		word.insert();
		word.save();
		word.share();
		
		
	}

}
