package testNGBasicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After SUite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Class 2 - Before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Class 2 - After Class");
	}
	@Test
	public void test1()
	{
		System.out.println("Class 2 - Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Class 2 -Test 2");
	}

}
