package com.webelement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * wait
 * implicit wait
 * explicit wait
 */
public class WaitInSelenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(90));
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
	Thread.sleep(2000);
	String txt= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).getText();
	System.out.println(txt);
	driver.close();
}
}
