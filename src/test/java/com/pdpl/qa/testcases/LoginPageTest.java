package com.pdpl.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.pages.LoginPage;
import com.pdpl.qa.pages.PolicySelection;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	PolicySelection policySelection;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();  
	}

	@Test(priority=1)
	public void loginTest()
	{
		policySelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

