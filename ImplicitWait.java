package com.program.selenium.firstautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//implicitly wait--is always applied globally --is available for all the webelements
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
//
		WebElement firstname = driver.findElement(By.name("firstname"));
	    WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement numemail = driver.findElement(By.name("reg_email_"));
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));

		
		sendkeys(driver,firstname,5,"Tom");
		sendkeys(driver,lastname,5,"mino");	
		sendkeys(driver,numemail,5,"nilima@");	
		sendkeys(driver,pwd,10,"Nil@");		

       WebElement forgotpassword = driver.findElement(By.name("Forgotten account?"));
       clickable(driver,forgotpassword,5);

	}
////
	//create method 
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		//create object of webdriverwait 
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	//for click method in explicite way
	public static void clickable(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();


	}
}
