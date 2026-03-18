package com.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(5000);
	List<WebElement> t_row= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	int r_size=t_row.size();
	System.out.println("no of row :"+r_size);
	
	List<WebElement> t_col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	int col_size=t_col.size();
	System.out.println("no of col is :"+col_size);
	
	for (int i = 1; i <=r_size; i++) {
		for (int j = 1; j <=col_size; j++) {
			String data= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("  |  "+data);
			Thread.sleep(1000);
		}
		System.out.println();
	}
}
}
