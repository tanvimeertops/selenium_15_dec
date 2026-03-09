package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Css class 
 * tagname.class_value
 */
public class LocCssClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input.x1i10hfl.xggy1nq.xtpw4lu.x1tutvks."
			+ "x1s3xk63.x1s07b3s.x1a2a7pz.xjbqb8w"
			+ ".x1v8p93f.x1o3jo1z.x16stqrj.xv5lvn5"
			+ ".x1ejq31n.x18oe1m7.x1sy0etr.xstzfhl"
			+ ".x972fbf.x10w94by.x1qhh985.x14e42zd"
			+ ".x9f619.xzsf02u.x1lliihq.x15h3p50.x10emqs4.x1vr9vpq.x1iyjqo2.x10d0gm4.x1fhayk4.x16wdlz0.x3cjxhe.xe9ewy2.x11lt19s.xeuugli.xlyipyv.x1hcrkkg.xfvqz1d.x12vv892.x1hu168l.xttzon8.x1sfh74k.x3fqe8q.x185fvkj.x1p97g3g.xmtqnhx.x11ig0mb.xgmu6d7.x1quw8ve.xx0ingd.xp5op4.x1y44fgy.xdzva22.xs8nzd4.x1fzehxr.xha3pab")).sendKeys("t@gmail.com");
	Thread.sleep(2000);
	
}
}
