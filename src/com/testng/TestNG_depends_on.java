package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_depends_on {
	WebDriver driver;
	@Test
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "before")
	public void enterUsername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
//	@Test(dependsOnMethods = "enterUsername")
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = "enterPassword")
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("test pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = "clickLogin")
	public void after() {
		driver.close();
	}
}
