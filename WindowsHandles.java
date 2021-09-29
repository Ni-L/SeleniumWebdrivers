package com.program.selenium.firstautomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      String currentwindow = driver.getWindowHandle();
	      Set<String> allWindows = driver.getWindowHandles();
	      java.util.Iterator<String> i = allWindows.iterator();
	      while(i.hasNext()){
	         String childwindow = i.next();
	         if(!childwindow.equalsIgnoreCase(currentwindow)){
	            driver.switchTo().window(childwindow);
	            System.out.println("The child window is "+childwindow);
	         } else {
	            System.out.println("There are no children");
	         }
	      }
	      driver.quit();
	   }
}