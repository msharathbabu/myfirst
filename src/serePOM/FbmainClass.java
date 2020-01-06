package serePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbmainClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		FbPOM fp = new FbPOM(driver);

		fp.setUntb("9700105142");
		fp.setPwtb("sharathbabu");
		fp.getLoginBtn().click();
		 
	}

}
