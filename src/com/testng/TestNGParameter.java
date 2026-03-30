package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
  @Test 
  @Parameters({"username","password"})
  public void f(String username,String pass) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("test pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		driver.close();
  }
}
