package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTest {
	
	
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.omrbranch.com/");

	driver.manage().window().maximize();
	
	WebElement sing = driver.findElement(By.xpath("(//a[@type='text'])[2]"));
	sing.click();
	
	Thread.sleep(1000);
	
	WebElement deb = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	deb.click();
	
	

	
}

}
