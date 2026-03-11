package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	Thread.sleep(5000);
	// //tagname[@attr_name='attr_value']
	// //input[@name='uid']
	driver.findElement(By.xpath("//input[@onkeyup='validateuserid();']")).sendKeys("123");
	// //tagname[text()='text value']
	// //b[normalize-space()='Testing']
	String data= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println("data is "+data);
}
}
