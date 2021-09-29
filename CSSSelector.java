package com.program.selenium.firstautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		// set Property indicates by the specific key
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get use to load webpage in current browser
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		//findElement is for finding webelement
		//By ID it willnot work
	       //driver.findElement(By.cssSelector("input#Email or Phone")).sendKeys("Nilima"); 
		//By class it will work
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Nilima"); 
		//By attribute not work
		 //driver.findElement(By.cssSelector("input[name=Email]")).sendKeys("Hello"); 
		//Using Contains
		//driver.findElement(By.cssSelector("input[id*='id']")).sendKeys("hi");
		driver.findElement(By.cssSelector("input:contains('id')")).sendKeys("hi");
	}

}
