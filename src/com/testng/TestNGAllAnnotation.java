package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAllAnnotation {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void before() {
		System.out.println("Before method");
	}
	
	@Ignore
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@AfterMethod
	public void after() {
		System.out.println("after method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
}
