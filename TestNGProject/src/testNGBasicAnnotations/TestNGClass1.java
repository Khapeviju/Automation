package testNGBasicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass1 {
	

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
    @AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeMethod
	  public void BeforeMethod()
     //  public void test1()
       
   {
	System.out.println("Before Method");
	
   }
	
	@AfterMethod
	public void AfterMethod()
    
	//   public void test2()
       
   {
	System.out.println("After Method");
	
   }
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
		
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclasss");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test case 1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test case 2");
	}
}
