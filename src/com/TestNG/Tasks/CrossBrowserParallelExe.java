package com.TestNG.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallelExe {

	@Parameters("browser")
	@Test
	
	public void chooseBrowser(String browserValue )
	{

		WebDriver driver =null;

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".drivers/chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", ".drivers/geckodriver.exe");
			driver=new FirefoxDriver();

		}
		driver.get("https://www.facebook.com");
	}


}
