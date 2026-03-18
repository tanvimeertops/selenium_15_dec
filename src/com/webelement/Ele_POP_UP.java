package com.webelement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_POP_UP {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	Thread.sleep(5000);
	String main_w= driver.getWindowHandle();
	System.out.println(main_w);
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Cli")).click();
	Thread.sleep(2000);
	
	Set<String> all_w=driver.getWindowHandles();
	System.out.println(all_w);
	Thread.sleep(2000);
	Iterator<String> i1=all_w.iterator();
	while (i1.hasNext()) {
		String child_w = (String) i1.next();
		System.out.println(child_w);
		if (!main_w.equals(child_w)) {
			System.out.println("child window open");
			driver.switchTo().window(child_w);
			Thread.sleep(2000);
			driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);	
			driver.close();
			
		}
		
	}
	driver.switchTo().window(main_w);
	Thread.sleep(2000);
	System.out.println("current window :"+driver.getWindowHandle());
	Thread.sleep(2000);
	driver.close();
}
}
