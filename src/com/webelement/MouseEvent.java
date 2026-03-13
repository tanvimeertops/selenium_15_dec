package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(5000);
	WebElement home=driver.findElement(By.linkText("Home"));
	WebElement flight=driver.findElement(By.linkText("Flights"));
	WebElement hotel=driver.findElement(By.linkText("Hotels"));
	
	Actions actions=new Actions(driver);
	Action a1=actions
			.moveToElement(home)
			.build();
	a1.perform();
	Thread.sleep(2000);
	Action a2=actions
			.moveToElement(flight)
			.build();
	a2.perform();
	Action a3=actions
			.moveToElement(hotel)
			.build();
	a3.perform();
	
}
}
