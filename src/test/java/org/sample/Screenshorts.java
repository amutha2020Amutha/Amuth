package org.sample;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshorts {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File screen = tk.getScreenshotAs(OutputType.FILE);

	   File dest = new File("C:\\Users\\user\\eclipse-workspace\\AmuthaMaven\\screenshort\\facebook.png");

	  FileUtils.copyFile( screen, dest);
	}

}
