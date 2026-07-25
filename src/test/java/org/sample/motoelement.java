package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class motoelement {
	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
	
		Actions d=new Actions(driver);
		
       WebElement core = driver.findElement(By.xpath("//div[text()='Courses ']"));
       d.moveToElement(core).perform();
       
       WebElement software = driver.findElement(By.xpath("//div[@title='Java']"));
       d.moveToElement(software).perform();
       
      WebElement java = driver.findElement(By.xpath("//span[text()='Spring Certification Training']"));
       d.moveToElement(java).perform();
	}

}
