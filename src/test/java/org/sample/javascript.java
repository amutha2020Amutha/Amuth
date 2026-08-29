package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement email = driver.findElement(By.id("email"));

		js.executeScript("arguments[0].setAttribute('value','selenium123@gmail.com')", email);

		WebElement Pass = driver.findElement(By.id("pass"));

		js.executeScript("arguments[0].setAttribute('value','selenium123')", Pass);

	    Object o2 = js.executeScript("return arguments[0].getAttribute('value')", email);

		String s = (String) o2;
		System.out.println(s);

		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));

		js.executeScript("arguments[0].click()", login);

	}

}
