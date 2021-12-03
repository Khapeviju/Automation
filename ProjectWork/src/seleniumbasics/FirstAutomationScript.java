package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationScript {

	public WebDriver driver;

	// set browser driver location
	// The System class contains several useful class fieldsand methods. It cannot
	// be instantiated. Present in java.lang
	// execution
	void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\DST\\Selenium setup files\\Driver\\chromedriver.exe");  
		// chrome browser 80 + for webdriver 3.x
		driver = new ChromeDriver(); //// chrome browser below 80 version for webdriver 2.x
		driver.get("https://www.google.com/");
		
		String actualValue = driver.getTitle(); // Google
		String expectedValue = "Google";
		System.out.println(actualValue.length());
		System.out.println(expectedValue.length());
		
		if (actualValue.equals(expectedValue)) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");
		}
		driver.close();
		//System.out.println(actualValue);
	}
	
	void launchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DST\\Selenium setup files\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

	public static void main(String[] args) {

		FirstAutomationScript obj = new FirstAutomationScript();
		obj.launchChromeBrowser();
		//obj.launchFirefoxBrowser();
		
	}

}
