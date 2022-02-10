package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
static WebDriver dr;
	
/*
	@Given("^I launch the chrome Browser$")
	public static void IlaunchthechromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		dr = new ChromeDriver();

		dr.manage().window().maximize();
		Thread.sleep(2000);
         dr.navigate().to("https://www.flipkart.com/");
         
         Thread.sleep(2000);
         
		System.out.println("launching successfull");
		dr.quit(); 

	}*/
   @Given ("^User is on login page$")
   public void user_is_on_login_page() throws Throwable{
	  System.out.println("Login page is displayed");
	  System.setProperty("webdriver.chrome.driver","F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//Navigate
		dr.get("https://www.flipkart.com/");
	   
   }

@When("^User enter valid credentials$")
public void user_enter_valid_credentials() throws Throwable {
	
	dr.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Khapevijay@gmail.com");
	dr.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9604842171");
	dr.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click(); 
    
   // System.out.println("Enter the username and password");
    
    //username
    //Password
}
@When("^I enter valid (.*) and (.*) on login page$")
public void enter_multiple_values(String username,String password) throws Throwable {
	
	dr.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
	dr.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
	dr.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click(); 
    
   // System.out.println("Enter the username and password");
    
    //username
    //Password
}

@Then("^Home page should be displayed$")
public void home_page_should_be_displayed() throws Throwable {
	
 Assert.assertTrue(dr.getTitle().contentEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
    
    System.out.println("Homepage is displayed");
    
    //homepage
}

        
}