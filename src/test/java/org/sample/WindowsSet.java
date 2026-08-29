package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSet {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_V2&gad_source=5&gad_campaignid=23958748752&gclid=EAIaIQobChMI8v3B1tL3lQMV1alsCR3qYChzEAAYASAAEgIaofD_BwE");

		driver.manage().window().maximize();

		
	   driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).sendKeys("face wash");
	   
	   Robot c=new Robot();
	   
	   c.keyPress(KeyEvent.VK_ENTER);
	   c.keyRelease(KeyEvent.VK_ENTER);
	   
	   driver.findElement(By.xpath("((//h2[@class='css-xrzmfa'])[2])")).click();
	   
	   String windowsId = driver.getWindowHandle();
	   System.out.println(windowsId);
	   
	   Set<String> windowsall = driver.getWindowHandles();
	   System.out.println(windowsall);
	   
	   List<String>li=new ArrayList<String>();
	   
	   li.addAll(windowsall);
	   
	   driver.switchTo().window(li.get(1));
	   
	   driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
	  
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//span[@class='cart-count']")).click();	   
	   
	   
		
		
		
		
		
		
	}

}
