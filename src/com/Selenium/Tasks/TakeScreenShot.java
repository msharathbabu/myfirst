package com.Selenium.Tasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// Full Page ScreenShot TypeCasting
//		TakesScreenshot ts = (TakesScreenshot)driver;
//	    File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("screenshots/test.png");
//		Files.copy(src, dest);
		
		//or
		
//		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
//		File src = efw.getScreenshotAs(OutputType.FILE);
//		File dest = new File("screenshots/test1.png");
//		Files.copy(src, dest);
		
		// Full Page ScreenShot DownCasting
		
		
		// Paticular Element ScreenShot 
		
		WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));
		File scr = login.getScreenshotAs(OutputType.FILE);
		File dest = new File("screenshots/test2.png");
		Files.copy(scr, dest);

		
		
	}

}
