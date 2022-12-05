package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Loginpage;

public class LoginTest extends BaseClass{
   Loginpage lp=null;
	@BeforeSuite
	public void setup() throws Exception {
		initialization();
		lp=new Loginpage(driver);
	}
	@Test
	public void test01() {
		lp.loginapplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void test02() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
	}
	@Test void test03() {
		throw new SkipException("Skipping Testcase");
	}
}
