package com.Selenium.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);

//		WebElement src = driver.findElement(By.xpath("//div[@id='box1']"));
//		WebElement dest = driver.findElement(By.xpath("//div[@id='box101']"));
//		Actions as= new Actions(driver);
//		Thread.sleep(2000);
//		as.dragAndDrop(src, dest).perform();;
		 
		
	}

}
