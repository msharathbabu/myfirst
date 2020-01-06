package com.TestNG.Tasks;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println();		
		
		// Handling Assert


		Assert.assertEquals(driver.getTitle(), "Facebook-log or sign up");

// Handling SoftAsserts 
		//SoftAssert sa= new SoftAssert();
		//sa.assertEquals(driver.getTitle(), "Facebook-log or sign ");


	}

	@Test
	public void login1() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// Handling Assert

		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals(driver.getTitle(), "Facebook-log or sign up ");
		//sa.assertAll();

	}

	
}
