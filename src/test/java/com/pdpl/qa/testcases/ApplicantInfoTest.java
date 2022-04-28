package com.pdpl.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.pages.ApplicantInfo;
import com.pdpl.qa.pages.LoginPage;
import com.pdpl.qa.pages.PolicySelection;
import com.pdpl.qa.pages.Property;

public class ApplicantInfoTest extends TestBase{
	LoginPage loginPage;
	PolicySelection policySelection;
    ApplicantInfo applicantInfo;
    Property property;
	public ApplicantInfoTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		policySelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		applicantInfo =  policySelection.policyselectiondetails();
		
	}
	
	@Test(priority = 1)
	public void applicant() throws InterruptedException, AWTException {
		property= applicantInfo.applicantinfo();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
