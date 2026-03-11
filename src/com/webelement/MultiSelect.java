package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(5000);
	WebElement ele=driver.findElement(By.id("fruits"));
	Select s1=new Select(ele);
	
	s1.selectByIndex(2);
	Thread.sleep(2000);
	s1.selectByValue("banana");
	Thread.sleep(2000);
	s1.selectByVisibleText("Grape");
}
}
