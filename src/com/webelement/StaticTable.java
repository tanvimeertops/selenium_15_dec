package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:\\eclipse projects\\Selenium_15_dec\\src\\com\\webelement\\index1.html");
	Thread.sleep(5000);
	for (int i = 2; i <=4; i++) {
		for (int j = 1; j <=4; j++) {
			String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("  |  "+data);
		}
		System.out.println();
	}
}
}
