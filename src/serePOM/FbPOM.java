package serePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPOM {


	//Declaration

	@FindBy(id="email")private WebElement untb;
	@FindBy(name="pass")private WebElement pwtb;
	@FindBy(xpath="//input[@type='submit']")private WebElement loginBtn;


	//initialization

	public  FbPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	// Utilization

	public WebElement getUntb() {
		return untb;
	}


	public void setUntb(String un) {
		untb.sendKeys(un);;
	}


	public WebElement getPwtb() {
		return pwtb;
	}


	public void setPwtb(String pw) {
		pwtb.sendKeys(pw);;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void LoginBtn() { 
		loginBtn.click();;
	}




}





