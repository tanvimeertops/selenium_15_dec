package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(5000);
	WebElement ele=driver.findElement(By.name("country"));
	Select s1=new Select(ele);
	Thread.sleep(2000);
	s1.selectByValue("INDIA");
	Thread.sleep(2000);
	for (int i = 0; i <50; i++) {
		s1.selectByIndex(i);
		Thread.sleep(1000);
	}
	
	
}
}
