package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("email")).sendKeys("tanvi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("1234");
	Thread.sleep(2000);
//	driver.findElement(By.name("name attribute is not available for this element"))
	driver.close();
}
}
