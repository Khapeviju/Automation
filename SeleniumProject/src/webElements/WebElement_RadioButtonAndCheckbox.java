package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_RadioButtonAndCheckbox {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Navigate
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Click automobile
		
		dr.findElement(By.cssSelector("a[id='nav_automobile']")).click();
		
	    //dr.findElement(By.id("licenseplatenumber")).sendKeys("MH12GM6475");
		
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//Radio Button
        dr.findElement(By.xpath("//input[@id='gendermale' ]/..")).click();
        
        //Checkbox
        dr.findElement(By.xpath("//input[@id='speeding']//..")).click();
        
         
		
		
	}
}
