package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWebelement {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();
		//Options manage = driver.manage();
		//Window window = manage.window();
		//window.maximize();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert s = driver.switchTo().alert();
		
		System.out.println(s.getText());
		s.sendKeys("amutha");
		Thread.sleep(5000);
		s.accept();
		
	
		
		
		
		
		

	}
	
}
