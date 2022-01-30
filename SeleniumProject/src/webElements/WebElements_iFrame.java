package webElements;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElements_iFrame {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver cd =new ChromeDriver();
		
		cd.manage().window().maximize();
		
		
		cd.get("https://www.naukri.com/"); //_2KpZ6l _2doB4z
		
	 String parent=cd.getWindowHandle();
	 
	 Set<String> windows=cd.getWindowHandles();
	 
	  System.out.println(parent);
	  
	  System.out.println("*****************"); 
	  
	  for(String w: windows)
	  {
	    cd.switchTo().window(w);
	    if(!parent.contentEquals(w)) {  //! = equals
	    	 cd.close();
	    	
	    }
	   
	  }
	}
}
