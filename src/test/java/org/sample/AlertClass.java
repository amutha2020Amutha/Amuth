package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		// WebElement e = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		// e.click();

		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		//String text = a.getText();
		//System.out.println(text);
		
	    Thread.sleep(5000);
	
		 a.accept();
		//driver.quit();
	}

}
