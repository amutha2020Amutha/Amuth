package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpathu {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Actions h=new Actions(driver);
		
	    WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement Droppint = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		h.dragAndDrop(source, Droppint).perform();
		
		
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement Droppint1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		h.dragAndDrop(source1, Droppint1).perform();
		
		
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	    WebElement Droppint2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		h.dragAndDrop(source2, Droppint2).perform();
		
		
	    WebElement source3=	driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	    WebElement Droppint3 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
	    h.dragAndDrop(source3, Droppint3).perform();
		
	}		
		
}
