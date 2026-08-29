package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

		// all row

		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {

			WebElement row = rows.get(i);
		//	System.out.println(row.getText());

			List<WebElement> headings = row.findElements(By.tagName("th"));

			for (int j = 0; j < headings.size(); j++) {
				
				WebElement heading = headings.get(j);

				System.out.println(heading.getText());

			}
		}
	}
}

//			// paticular data
//
//			List<WebElement> headings = row.findElements(By.tagName("td"));
//
//			for (int j = 0; j < headings.size(); j++) {
//
//				if (j == 2) {
//
//					WebElement heading = headings.get(j);
//
//					String text = heading.getText();
//
//					if (text.contains("Mexico")) {
//
//						System.out.println(text);
//
//					}
//
//				}
//			
//		//to get all data
//			
//		List<WebElement>datas= row.findElements(By.tagName("td"));	
//		
//	     for (int j = 0; j < datas.size(); j++) {
//		
//		//if (j==0) {
//			
//		WebElement heading = datas.get(j);
//		
//		
//		System.out.println(heading.getText());
//		