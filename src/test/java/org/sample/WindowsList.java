package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsList {
	


	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("earphone wireless");
		
		Robot e=new Robot();
		
		e.keyPress(KeyEvent.VK_ENTER);
		e.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-secondary'])[2]")).click();
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String eachId:allwindows) {
		
	    
		if (!eachId.equals(handle)) {
	    	
	    	driver.switchTo().window(eachId);
	    	
		}
		}
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    	
	    	
	    	
	    	
	}	    

}
