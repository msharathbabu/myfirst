package serePOM;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SERE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		WebElement untb = driver.findElement(By.id("email"));
		WebElement pwtb = driver.findElement(By.name("pass"));
		driver.navigate().refresh();

// Handling StaleElementReferenceException 
// By using creating object		

		FbPOM se = new FbPOM(driver);

		se.setUntb("9700105142");
		se.setPwtb("sharathbabu");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

// Handling StaleElementReferenceException 
// By using try catch		
		

//		Thread.sleep(2000);
//		try {
//			untb.sendKeys("9700105142");
//			pwtb.sendKeys("sharathbabu");
//			
//		} catch (StaleElementReferenceException sere) {
//			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
//		}

	}
}
