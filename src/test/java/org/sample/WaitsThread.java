package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsThread {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");

		driver.manage().window().maximize();
		
		
		
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@type='text'])[2]")));
		
		FluentWait<WebDriver> d=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
	
		
		//d.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@type='text'])[2]")));
		
		
		WebElement wait = driver.findElement(By.xpath("(//a[@type='text'])[2]"));
		wait.click();
	}

}
