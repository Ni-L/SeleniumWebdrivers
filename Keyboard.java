package com.program.selenium.firstautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get use to load webpage in current browser
		driver.navigate().to("https://www.flipkart.com");
		//Flipkarthttps://www.flipkart.com

		Thread.sleep(3000);
		//Creating an object ofRobot Class
		Robot r = new Robot();
		r.mouseMove(200, 300);
		//press ALT key from keyboard
		r.keyPress(KeyEvent.VK_ALT);
		//press F key from keyboard
		r.keyPress(KeyEvent.VK_F);
		//Release F key from keyboard
		r.keyRelease(KeyEvent.VK_F);
		//Release Alt key from keyboard
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		//Press W key from keyboard to open a new private window 
		r.keyPress(KeyEvent.VK_W);
		//Release W key from keyboard
		r.keyRelease(KeyEvent.VK_W);
		//Thread.sleep(3000);
		//driver.close();
		//driver.quit();
	}
}
