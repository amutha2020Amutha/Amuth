package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoviwe {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://maven.apache.org/index.html");

	driver.manage().window().maximize();
	
	WebElement mock= driver.findElement(By.xpath("//a[text()='Data Privacy']"));
	
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    js.executeScript("arguments[0].scrollintoview(false)", mock);
	
	Thread.sleep(5000);
	
	WebElement courses= driver.findElement(By.xpath("//a[text()='What is Maven?']"));
	
	js.executeScript("arguments[0].scrollintoview(ture)",courses);
	
	

}
}
