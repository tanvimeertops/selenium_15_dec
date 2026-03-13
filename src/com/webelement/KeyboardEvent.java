package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
	WebElement email=driver.findElement(By.name("email"));
	
	Actions actions=new Actions(driver);
	Action a1=
	actions.moveToElement(email)
	.click()
	.keyDown(email, Keys.SHIFT)
	.sendKeys("tops")
	.keyUp(email, Keys.SHIFT)
	.contextClick()
	.build();
	a1.perform();
}
}
