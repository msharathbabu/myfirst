package com.Selenium.Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("m.sharathbabu519");
		WebElement loginbtn = driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 

		// WebElement loginbtn1 =driver.findElement(By.xpath("//span[@class='CwaK9\']"));
		 
		// WebElement loginbtn2=driver.findElement(By.xpath("//div[@class='ZFr60d
		// CeoRYc']"));

		// loginbtn2.click();

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"))).click().perform();

	}































		
//		WebDriverWait wait = new WebDriverWait(driver, 3);
//		WebElement loginbtn=driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"));
//		loginbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ZFr60d CeoRYc']")));
//		loginbtn.click();
//		Boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
//		if (invisible) {
}
		
		
		
		
		
		
		
		