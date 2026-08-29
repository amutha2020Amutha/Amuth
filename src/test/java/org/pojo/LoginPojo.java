package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	//1
	public LoginPojo() {
		PageFactory.initElements(driver,this);
	}
	
	//2  WebElement as private
	
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnlogin;

	@FindBy(xpath="(//a[@type='text'])[1]")
	private WebElement forget;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement forgetemail;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="(//a[@type='text'])[2]")
	private WebElement Singup;
	
	
	
	//3
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getForget() {
		return forget;
	}
	
	public WebElement getForgetemail() {
		return forgetemail;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSingup() {
		return Singup;
	}

	

}
