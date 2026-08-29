package org.Junit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram extends BaseClass{ 
	
	
	public Instagram() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement clickEmail;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement clickPass;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement clickLogin;

	public WebElement getClickEmail() {
		return clickEmail;
	}

	public WebElement getClickPass() {
		return clickPass;
	}

	public WebElement getClickLogin() {
		return clickLogin;
	}
	
	

}
