package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Css:
 * id
 * class
 * attr
 * 
 * syn:
 * tagname#id
 */
public class LocCssID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#login-button")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
