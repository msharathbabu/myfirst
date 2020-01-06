package com.Selenium.Tasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Facebook {
	@Test
	
	public   void main1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
		WebElement passward=driver.findElement(By.id("pass"));
		//WebElement login=driver.findElement(By.id("u_0_2"));
		
		username.sendKeys("9700105142");
		passward.sendKeys("9700105142");
		//login.click();
		driver.findElement(By.id("u_0_m")).sendKeys("babu");
		
		driver.findElement(By.id("u_0_a")).click();
		
		Select sel1=new Select(driver.findElement(By.id("day")));
		sel1.selectByValue("24");
		
		Select sel2= new Select(driver.findElement(By.id("month")));
		sel2.selectByVisibleText("Aug");
		
		Select sel3=new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("1996");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
	
		
		driver.close();
	}

}
