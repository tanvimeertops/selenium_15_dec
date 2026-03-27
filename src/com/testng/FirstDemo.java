package com.testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {
	@Test
	public void passTest() {
		System.out.println("this test is pass!!!");
	}

	@Test
	public void failTest() {
		System.out.println("this test is fail!!!");
		fail();
	}

	@Test
	public void skipTest() {
		throw new SkipException("Self Skipped!!!");
	}
}