
package com.program.selenium.firstautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://money.rediff.com/gainers");
	//  driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]")).getText();
	  
	  
//	String text1 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getText();
  //   System.out.println(text1);	
     
//     String text2 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/parent::td")).getText();
//     System.out.println(text2);
//     
//     String text3 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/parent::td/child::a")).getText();
//     System.out.println(text3);
//     
//     String text4 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/ancestor::tr")).getText();
//     System.out.println(text4);
//     
//     String text5 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/ancestor::tr/descendant::td")).getText();
//     System.out.println(text5);
//     
//     String text6 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/following::*")).getText();
//     System.out.println(text6);
//     
//     String text7 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/ancestor::tr/following-sibling::*")).getText();
//     System.out.println(text7);
//     
//     String text8 = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/ancestor::tr/preceding-sibling::*")).getText();
//        System.out.println(text8);
//     
//     
	  //get location
	 Point locations= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getLocation();
	     System.out.println(locations);	   
	     
	  //getsize
	     Dimension size= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getSize();
	    System.out.println(size);
	    
	  //get size by height
	     //int size= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getSize().getHeight();
	    // System.out.println(size);
	  //Is location 
	 boolean location = driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).isDisplayed();
		     System.out.println(location);	
	  
	  //Is Enable
	  boolean enable= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).isEnabled();
		   System.out.println(enable);
	  
	  //Is selected
	  boolean isselect= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).isSelected();
	   System.out.println(isselect);
	  
	  //Get Attribute
	  String attribute= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getAttribute("Sicagen India");
	   System.out.println(attribute);
	  
	  
	  //Get tagname
	  String tagname= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getTagName();
	   System.out.println(tagname);
	  
	  //get
	  Rectangle b= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getRect();
	   System.out.println(b.width);
      //	  
	  String a= driver.findElement(By.xpath("//a[contains(text(),'Sicagen India')]/self::a")).getCssValue("color");
	   System.out.println(a);
	}
	
}