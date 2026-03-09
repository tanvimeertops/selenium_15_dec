package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	//to open empty browser
	WebDriver driver=new ChromeDriver();
	//to open website
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(5000);
	System.out.println("url :"+driver.getCurrentUrl());
	System.out.println("title :"+driver.getTitle());
	driver.close(); //to close tab
//	driver.quit(); //to close browser
}
}
