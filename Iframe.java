package com.program.selenium.firstautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// set Property indicates by the specific key
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get use to load webpage in current browser
		driver.get("https://rediff.com");
		driver.switchTo().frame("moneyiframe");
		String nse = driver.findElement(By.id("nseindex")).getText();
		System.out.print(nse);
		//focusing on parent page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SPORTS")).click();
		
		//By Index
		//driver.switchTo().frame("moneyiframe");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='moneyiframe']*")));
		//String nse = driver.findElement(By.id("ob-user-test")).getText();
		//System.out.print(nse);
		
		

	}

}
