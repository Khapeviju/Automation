package webElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class WebElement_Fileupload {

	@Test
	public void fileupload() throws AWTException, InterruptedException
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
		dr.findElement(By.id("open")).click();
		
		//Keyboard and mouse related operations
		Robot robot = new Robot();
		
		StringSelection cb= new StringSelection("C:\\Users\\dell\\eclipse-workspace\\SeleniumProject\\src\\webElements\\WebElement_Calender.java");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
	   
	    Thread.sleep(10000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.delay(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	
	}
	

}
