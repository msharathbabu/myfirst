package com.actiTIME.Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	
    @FindBy(id="email") private WebElement untb;
	
	@FindBy(name="pass") private WebElement pwtb;
	
	@FindBy(id="loginbutton") private WebElement loginBtn;
	
//	@FindBy(xpath = "//a") private List<WebElement> allLinks;
//	 
//	public List<WebElement> getAllLinks()
//	{
//		return allLinks; 
//	
//	}
//	public void CountLinks() 
//	{
//		System.out.println(allLinks.size());
//	}
	public ActiLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUntb() {
		return untb;
	}
	public void setUntb(String un) {
		untb.sendKeys(un);
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public void setPwtb(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void clickLoginBtn() {
        loginBtn.click();
	}
	public void login(String un,String pwd) {
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
	
	}
}



