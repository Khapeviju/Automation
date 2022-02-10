package testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;


public class CaptureScreenshot {
	public static void main(String[] args) throws IOException {
		
		//C:\Users\dell\eclipse-workspace\AutomationFramework\BrowserDrivers\chromedriver.exe
		
	//	System.out.println(System.getProperty("user.dir")+"BrowserDrivers\\chromedriver.exe");
	
		ApplicationLibrary lib = new ApplicationLibrary();
		
		WebDriver dr = lib.launchBrowser("Chrome");
		
	    dr.get(Configuration.url);
		
	 //   dr.findElement(By.id("abc123")).click();
	
	    List<WebElement> list=dr.findElements(By.id("nav_automobile"));
	    
	    if(list.size()>0)
	    {
	    	System.out.println("Element is Present");
	    }
	    else {
	    	System.out.println("Element is not Present");
	    }
	    
	    /*    
	    if(element is present) {
	    	
	    	//proceed with the next step
	    	
	    }else
	    	//capture screenshot */
		TakesScreenshot screenshot =  (TakesScreenshot)dr;
     	File src = screenshot.getScreenshotAs(OutputType.FILE);
     	
     	String name = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
     	
     	FileHandler.copy(src,new File("F:\\DST\\Lectures\\Video lectures 2\\Screenshot\\login_"+name+".png"));
		
     	
		
	 
		
	}


	
	
}
