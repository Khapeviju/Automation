package Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterConcept {
	
	@Test(priority=0)
	@Parameters({"browser"})
	
	public void launchBrowser(String browserName)
	{
		System.out.println("Launch the Browser:"+browserName);
		//System.out.println(10/0);
		// <exclude name= "verifyInbox"></exclude>
	}
  
	@Test(priority=1, dependsOnMethods = {"launchBrowser"})
	public void login()
	{
		System.out.println("Login test");
	}
	
	@Test(priority=2, dependsOnMethods = {"login"})
	public void verifyInbox()
	{
		System.out.println("Verify Inbox");
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	public void Logout()
	{
		System.out.println("Logout");
	}
	
	
} 
