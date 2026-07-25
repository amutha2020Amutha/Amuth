package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	
	public static void main(String[] args) throws AWTException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		Actions a=new Actions(driver);
		
		a.keyDown(email,Keys.SHIFT).perform();
		a.sendKeys(email,"greens").perform();
		a.keyUp(email,Keys.SHIFT).perform();
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		Robot r=new Robot();
		
		for (int i = 0; i <=3; i++) {
			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
	}
}
