package com.actiTIME.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts
{

public static WebDriver driver;
FileLib flib;

public void openBrowser() throws Throwable
{
	
	flib=new FileLib();
	String browserValue = flib.getkeyPropValue(PROPERTY_PATH,"browser");
	if (browserValue.equalsIgnoreCase("chrome"))
	{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new ChromeDriver();

	}
	else if (browserValue.equalsIgnoreCase("firefox"))
	{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver=new FirefoxDriver();
	
	}
	
	driver.get(flib.getkeyPropValue(PROPERTY_PATH,"url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}

public void closebrowser()
{
	driver.quit();
}
}
