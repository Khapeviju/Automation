package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElement_Dropdown {
	
	@Test
	public void test3()
	{

		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Navigate
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		dr.findElement(By.cssSelector("a[id='nav_automobile']")).click();
		
		WebElement ele= dr.findElement(By.id("make"));
		
		Select sel =new Select(ele);
		
		//selectbyvalue
		sel.deselectByIndex(3);
		
		
		
	}

}
