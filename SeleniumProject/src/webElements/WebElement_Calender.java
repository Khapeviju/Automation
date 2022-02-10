package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Calender {

	@Test
	public void calender()
	{

	System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
	ChromeDriver dr =new ChromeDriver();
	
	//dr.manage().window().maximize();
	//Used to maximize the browser
	
	//Navigate
	dr.get("http://sampleapp.tricentis.com/101/index.php");
	
	dr.findElement(By.cssSelector("a[id='nav_automobile']")).click();
	
	dr.findElement(By.id("opendateofmanufacturecalender")).click();

	//26-12-1999
	String expYear="1993";
	String expMonth="October";
	String day="31";
	
	String actYear=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	System.out.println(actYear);
	
	while(!expYear.equals(actYear))
		
	{
		dr.findElement(By.xpath("//a[@title='Prev']")).click();
	actYear=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
	}
    String actMonth=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	while(!expMonth.equals(actMonth))
	{
		dr.findElement(By.xpath("//a[@title='Prev']")).click();
		actMonth=dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
	}
	
		{
			dr.findElement(By.xpath("//a[text()='"+day+"']")).click();
			
			//td[@data-handler='selectDay']
		}

	
	}
}
