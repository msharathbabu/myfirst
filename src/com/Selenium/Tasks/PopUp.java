package com.Selenium.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.cleartrip.com/");
		
		WebElement fromtag = driver.findElement(By.id("FromTag"));
		WebElement totag = driver.findElement(By.id("ToTag"));
		fromtag.sendKeys("bangalore");
		totag.sendKeys("hyderabad");
		
		driver.findElement(By.id("DepartDate")).click();;
		driver.findElement(By.xpath("//td[@data-month='11']//a[.='20']")).click();;
		
		WebElement ad = driver.findElement(By.xpath("//select[@name='adults']"));
		
		Select sc=new Select(ad);
		sc.selectByIndex(0);
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		WebElement ad1 = driver.findElement(By.xpath("//select[@id='Class']"));
		
		Select sc1=new Select(ad1);
		sc1.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("AirAsia");
		
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
		
	}

}
