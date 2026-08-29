package org.sample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement car = driver.findElement(By.xpath("//select[@name='cars']"));
		Select g = new Select(car);

		if (g.isMultiple()) {

			System.out.println("able to select mutiple options");

		} else {

			System.out.println("able to select single options");

		}
		g.selectByValue("audi");
		g.selectByVisibleText("Volvo");
		g.selectByIndex(2);

		WebElement firstSelected = g.getFirstSelectedOption();
		String text = firstSelected.getText();
		System.out.println(text);
		List<WebElement> allSelected = g.getAllSelectedOptions();

		for (WebElement r : allSelected) {

			System.out.println(r.getText());

		}
		List<WebElement> options = g.getOptions();

		for (WebElement s : options) {

			System.out.println(s.getText());

		}
		g.deselectByValue("opel");
		g.deselectByIndex(0);
		g.deselectAll();

	}
}
