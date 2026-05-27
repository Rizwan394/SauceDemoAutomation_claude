package com.saucedemo.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest 
{

	public WebDriver driver ;  // non-static — each test gets its own driver instance

	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();  //auto-downloads correct chromedriver
		driver = new ChromeDriver();              // launches Chrome browser
		driver.manage().window().maximize();      
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void verifyLaunch() 
	{
	    System.out.println("Browser launched successfully!");
	    System.out.println("Title: " + driver.getTitle());
	}
	
	@AfterMethod
	public void teardown()
		{
			if(driver != null) // null check prevents NullPointerException
			{
				driver.quit(); // closes all windows + ends WebDriver session
			}
		}
	}
	
