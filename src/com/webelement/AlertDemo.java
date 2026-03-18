package com.webelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(5000);
	//cusid
	driver.findElement(By.name("cusid")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert a1=driver.switchTo().alert();
	Thread.sleep(2000);
//	a1.dismiss(); //cancel
	System.out.println(a1.getText());
	a1.accept();
	Thread.sleep(2000);
	Alert a2=driver.switchTo().alert();
	System.out.println(a2.getText());
	a2.accept();
	Thread.sleep(3000);
	driver.close();
}
}
