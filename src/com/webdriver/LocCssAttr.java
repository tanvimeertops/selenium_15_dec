package com.webdriver;
import org.openqa.selenium.By;
/*
 * Css Attr :other than id,name,class 
 * everything else is css attr
 * 
 * tagname[attr_name='atrr_value']
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocCssAttr {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[autocomplete='username webauthn']")).sendKeys("t@gmael.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("3434");
	
}
}
