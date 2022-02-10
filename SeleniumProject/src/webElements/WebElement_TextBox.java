package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_TextBox {

	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Navigate
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		dr.findElement(By.cssSelector("a[id='nav_automobile']")).click();
		
		dr.findElement(By.id("engineperformance")).sendKeys("1234");
		
		
		
	}
}