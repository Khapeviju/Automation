package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	
	@Test(dataProvider="getData")
	public void login(String username, String password)
	{
		System.out.println("Enter username: "+username);
		System.out.println("Enter password: "+password);
		System.out.println("Click login");
	}
	
	@Test(dataProvider="getData2")
	public void login(String username, String password, String email)
	{
		System.out.println("Enter username: "+username);
		System.out.println("Enter password: "+password);
		System.out.println("Enter email: "+email);
		System.out.println("Click login");
	}
	
	@DataProvider
	public String[][] getData()
	{
		//User1, password1
		//user2, password2
		//user3, password3
		
		String[][] data = new String[3][2];
		
		//Row 1
		data[0][0]="user1";
		data[0][1]="password1";
		
		//Row 2
	    data[1][0]="user2";
		data[1][1]="password2";
		
		//Row 3
		data[2][0]="user3";
		data[2][1]="password3";
		
		return data;
		
	}
	@DataProvider
	public String[][] getData2()
	{
		//User1, password1
		//user2, password2
		//user3, password3
		
		String[][] data = new String[2][3];
		
		//Row 1
		data[0][0]="user1";
		data[0][1]="password";
		data[0][2]="Vijaykhape@gmail.com";
		
		//Row 2
	    data[1][0]="user2";
		data[1][1]="password2";
		data[1][2]="Vijaykhape@gmail.com";
		
		return data;
		
	}

}
