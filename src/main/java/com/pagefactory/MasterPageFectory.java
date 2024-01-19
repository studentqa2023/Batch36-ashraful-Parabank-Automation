package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFectory {
	public MasterPageFectory (WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	//handle the null point exception
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logoutbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
}
