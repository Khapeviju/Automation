package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		//RBI -- Webdriver
		//HDFC -- ChromeBrowser
		//Kotak -- Firefoxdriver
		//Union -- opera
		
		RBI bank1 = new HDFC();
		/*
		bank1.creditcard();     //get
		bank1.savingaccount();  //Send keys
		bank1.debitcard();      //click
		bank1.currentaccount(); //close
		
		System.out.println("*****************");
		
		 bank1 = new Union();
			
			bank1.creditcard();     //get
			bank1.savingaccount();  //Send keys
			bank1.debitcard();      //click
			bank1.currentaccount(); //close
			
			System.out.println("***************");
			
			 bank1 = new Kotak();
				
				bank1.creditcard();     //get
				bank1.savingaccount();  //Send keys
				bank1.debitcard();      //click
				bank1.currentaccount(); //close
				
				System.out.println("*****************");
				*/
	
      test1();
	}
	public static void test1()
	{
		bank(new HDFC());
		bank(new Union());
		bank (new Kotak());
		
		
	}
	public static void bank(RBI bank1)
	{
		bank1.creditcard();     //get
		bank1.savingaccount();  //Send keys
		bank1.debitcard();      //click
		bank1.currentaccount(); //close
	}

}
