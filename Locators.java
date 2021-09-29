package com.program.selenium.firstautomation;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// set Property indicates by the specific key
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get use to load webpage in current browser
		driver.get("https://en-gb.facebook.com/");
		System.out.println(driver.getTitle());
		//findElement is for finding webelement
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]))")).click();
		Thread.sleep(3000);
		//findElement is for finding webelement
		//for finding and firstname
		driver.findElement(By.name("firstname")).sendKeys("Nilima");
		//for finding and lastname
		driver.findElement(By.name("lastname")).sendKeys("Wadal");
		//for finding and mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9764417513");
		//for finding and password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Nilima@96");
		//for finding and birth day
		driver.findElement(By.name("birthday_day")).sendKeys("19");
		//for finding and birth mam
		driver.findElement(By.name("birthday_month")).sendKeys("Aug");
		//for finding and birth year
		driver.findElement(By.name("birthday_year")).sendKeys("1996");
		//for finding button click or not
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File SourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./Screenshot/"+"facebook-register-"+ System.currentTimeMillis()+".png");
		
			try {
				FileHandler.copy(SourceFile,destinationFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
	}


