package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ByesAll extends BaseClass {

	public ByesAll() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(xpath = "(//input[@type='email'])[1]"), @FindBy(xpath = "//input[@id='email']"),
			@FindBy(xpath = "//input[@name='email']") })

	private WebElement txtemail;

	@FindAll({ @FindBy(xpath = "//input[@name='pass']"), @FindBy(xpath = "//input[@type='password']"),
			@FindBy(xpath = "//input[@id='password']") })

	private WebElement txtPass;

    @FindBy(xpath="//button[text()='Login']")
    private WebElement btnlogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
