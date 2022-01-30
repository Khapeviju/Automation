package webElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Navigate
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//close the window
		dr.close();
		
		//dr.quit();
	
	}

}
  