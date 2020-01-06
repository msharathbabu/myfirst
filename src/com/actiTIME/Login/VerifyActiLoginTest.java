package com.actiTIME.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actiTIME.genericLib.FileLib;

public class VerifyActiLoginTest {
	
	@Test

		public void ActiValidLogin() throws Throwable {
			String excelpath="./data/input.xlsx";
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//driver.get("https://actitime.jmr.co.za/actitime/login.do");
			Thread.sleep(2000);
			
			FileLib flib=new FileLib();
			String username =flib.getcelldata(excelpath, "valid", 1, 0);
			String password =flib.getcelldata(excelpath, "valid", 1, 0);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
	        driver.findElement(By.name("pwd")).sendKeys(password);
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
@Test
public void ActiInvalidLogin() throws Throwable {
		
		String excelpath="./data/input.xlsx";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://actitime.jmr.co.za/actitime/login.do");
		Thread.sleep(2000);
		
		FileLib flib=new FileLib();
		int rowCount=flib.getRowcellCount(excelpath, "invalid");
		
		for (int i = 1; i<=rowCount; i++) {
			
			String username =flib.getcelldata(excelpath, "invalid", i, 0);
			String password =flib.getcelldata(excelpath, "invalid", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
	        driver.findElement(By.name("pwd")).sendKeys(password);
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			//driver.navigate().refresh();
		
			Thread.sleep(3000);
			
			WebElement errmsg=driver.findElement(By.xpath("//span[@class='errormsg']"));
			errmsg.getText();
		

			if (errmsg.isDisplayed()) 
			{
			System.out.println("Error is displayed--->Testcase Passed");
			flib.setCelldata(excelpath, "invalid", i, 2, "Pass");
			}
			else
			{
				System.out.println("Error is not displayed--->Testcase Failed");
				flib.setCelldata(excelpath, "invalid", i, 2, "Fail");
			}
			driver.close();
		}
		
	}
}
