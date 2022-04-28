package com.pdpl.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.pages.ApplicantInfo;
import com.pdpl.qa.pages.Endorsement;
import com.pdpl.qa.pages.LoginPage;
import com.pdpl.qa.pages.LossHistoryInfo;
import com.pdpl.qa.pages.PolicySelection;
import com.pdpl.qa.pages.Property;
import com.pdpl.qa.pages.Quote;

public class LossHistoryInfoPageTest extends TestBase{
	LoginPage loginPage;
	PolicySelection policySelection;
	ApplicantInfo applicantInfo;
	Property property;
	Endorsement endo;
	LossHistoryInfo lhi;
    Quote quote;
	public LossHistoryInfoPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, AWTException {
		initialization();
		loginPage = new LoginPage();
		policySelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		applicantInfo = policySelection.policyselectiondetails();
		property = applicantInfo.applicantinfo();
		endo = property.proprtyDetails();
		lhi = endo.endorsementDetails();
	}

	@Test(priority = 1)
	public void losshistory() throws InterruptedException {
		quote = lhi.losshistoryInfo();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
