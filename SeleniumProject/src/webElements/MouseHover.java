package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\DRIVERS\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		
		dr.manage().window().maximize();
		//Used to maximize the browser
		
		//Implicit wait
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate
		dr.get("https://www.flipkart.com/fashion-republic-day-sale-jan-2022-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_e63c1a82-1f97-4843-87a3-df25fd6b7229_1_9XMGQ283ICSB_MC.NYEMHX57LP8R&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion_NYEMHX57LP8R&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=NYEMHX57LP8R"); //_2KpZ6l _2doB4z
		
	  //  Thread.sleep(1000);
		
    // 	dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z\']")).click(); 
		//close the login page
		
		
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
      /*	Implicit wait will wait for your elements presence on web page and it will poll dom in everyone 500 ms
            so suppose we have given 10 seconds wait in "dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);"
            then it will poll dom 20 times max and if element is visible in 1000 ms then it will not wait for rest of the 9 seconds 9:06 AM
            it will jump to next step
*/
     	 Actions act=new Actions(dr);
 		
 		act.moveToElement(dr.findElementByXPath("//span[text()='Women']")).build().perform();
 		
 	    Thread.sleep(2000);

 		
 		dr.findElementByXPath("//a[text()='Flats']").click();
     	
	//	dr.findElement(By.xpath("//button[@class='eFQ30H\']")).click();
		
 		//Explicit wait
        WebDriverWait wait = new WebDriverWait(dr,10);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_31Kbhn _28DFQy']/div[@class='_3FdLqY']")));
		
        act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']/div[@class='_3FdLqY']")), 50, 0).build().perform();
        
	}	 

}
 