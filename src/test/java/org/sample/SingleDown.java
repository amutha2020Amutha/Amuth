package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/");

		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(//a[@type='text'])[2]")).click();
		
		Thread.sleep(5000);
		
		WebElement single = driver.findElement(By.xpath("//select[@name='year']"));
		
		Select d=new Select(single);
		
		if (d.isMultiple()) {
			
			System.out.println("able to select mutiple options");
			
		}else {
			
			System.out.println("able to select single options");
			
		}
		
		d.selectByValue("2001");
		d.selectByVisibleText("2003");
		d.deselectByIndex(10);

	}

}
