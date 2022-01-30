package webElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Alerts {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver cd =new ChromeDriver();
		
		cd.manage().window().maximize();
		
		
		cd.get("https://demoqa.com/alerts"); //_2KpZ6l _2doB4z
		
	    cd.findElementByXPath("//button[@id='alertButton']").click();
	    
	    Alert alt=cd.switchTo().alert();
	    	
	    System.out.println(alt.getText());
	    alt.accept();
	    
	    cd.switchTo().frame(0);
	    System.out.println(cd.findElementsByXPath(""));
	    
		
	}

}
