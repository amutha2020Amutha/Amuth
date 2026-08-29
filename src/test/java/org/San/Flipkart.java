package org.San;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart extends BaseClass {
	
	
	public Flipkart() {
		
	PageFactory.initElements(driver,this);		
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Clicklogin;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accoundlogin;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement txtotp;
	
	@FindBy(xpath="//a[@class='nYcTDx']")
	private WebElement creataccount;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobileno;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement continuebtn;
	
	@FindBy(xpath="//span[text()='Existing User? Log in']")
	private WebElement exit;
	

	public WebElement getClicklogin() {
		return Clicklogin;
		
	}
	public WebElement getAccoundlogin() {
		return accoundlogin;

	}
	
	
	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtotp() {
		return txtotp;
	}

	public WebElement getCreataccount() {
		return creataccount;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getExit() {
		return exit;
	}
	

}
