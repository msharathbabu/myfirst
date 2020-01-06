package com.Selenium.Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TripAdv {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//div[@title='Search']/span/following-sibling::span"));
		Actions as = new Actions(driver);

		as.moveToElement(searchbox).click().build().perform();
		WebElement sd = driver.findElement(By.xpath("//div[@class='input_box activeInput']/span/following::input[@id='mainSearch']"));

		sd.sendKeys("club mahindra");
		Thread.sleep(2000);
		 List<WebElement> alloptions = driver.findElements(By.xpath("//li[contains(@class,'displayItem result')]"));
		Thread.sleep(3000);
		int count=alloptions.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(alloptions.get(i).getText());
			// alloptions.click();
			
		}
		//alloptions.sendKeys(Keys.ARROW_DOWN);
		
	}

}
