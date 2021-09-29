package com.program.selenium.firstautomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// set Property indicates by the specific key
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get use to load webpage in current browser
		driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.name("birthday_day")));
        
        List<WebElement> options = s.getOptions();
		int size = options.size();
        System.out.print("Number of elements present inside the listbox is :  " +size);
        
        s.selectByIndex(1);
       // s.selectByValue("4");
       //s.selectByVisibleText("");;
        Select s2 = new Select(driver.findElement(By.name("birthday_month")));
        s2.selectByValue("4");
        s2.selectByVisibleText("May");;

        Select s3 = new Select(driver.findElement(By.name("birthday_year")));
        s3.selectByIndex(25);
        s3.deselectAll();
	}

}
