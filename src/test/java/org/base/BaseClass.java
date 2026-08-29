package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.net.URL;

import org.apache.poi.common.usermodel.Fill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static	WebDriver driver;
	public static	Actions a;
	public static Robot r;
	
	
	public static void webpage() {
		 driver=new ChromeDriver();

	}
	public static void maximize() {
	
	driver.manage().window().maximize();
	}
	
	public static void tourl(String url) {
		
		driver.get(url);
	}
	
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void toQuit() {
		driver.quit();
	}
	 
	public static void fill(WebElement element,String usertext) {
		element.sendKeys(usertext);
	}
	
	public static void toClick(WebElement element) {
	  element.click();
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static String togetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		//System.out.println(attribute);
		return attribute;
	}
	
	public static void toMoveToElement(WebElement element) {
		 a=new Actions(driver);
		a.moveToElement(element).perform();    
	}
		
	public static void toDragAndDrop(WebElement source,WebElement dest) {
		a.dragAndDrop(source, dest).perform();
	}
	
	public static void toDoulbeClick(WebElement element) {
		a.doubleClick(element).perform();
	}
	public static void toContextClick(WebElement element) {
		a.contextClick(element).perform();
	}
	public static void toEnter() throws AWTException {
	 r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	private void toGetScreenShortas(WebElement element) {
		element.getScreenshotAs(null);

	}
	private void toExecuteScript() {
		

	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
