package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Web_Element_Link {
 
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Navigate
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Find element
		
		//xpath
	   //  WebElement link=dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		
	    //Css selector
		WebElement link=dr.findElement(By.cssSelector("a[id='nav_automobile']")); // bY CSS selector
		
		//WebElement link=dr.findElement(By.partialLinkText("Truc"));
		//Truck
		
		Assert.assertEquals(link.getText(), "Automobile");
		
		// System.out.println(link.getText());
		 
		 link.click();
		 
	//    Thread.sleep(6000);		
	}
}
