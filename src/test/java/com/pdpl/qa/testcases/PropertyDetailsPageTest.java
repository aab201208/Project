package com.pdpl.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.pages.AI;
import com.pdpl.qa.pages.ApplicantInfo;
import com.pdpl.qa.pages.Endorsement;
import com.pdpl.qa.pages.LoginPage;
import com.pdpl.qa.pages.LossHistoryInfo;
import com.pdpl.qa.pages.PaymentsOption;
import com.pdpl.qa.pages.PolicySelection;
import com.pdpl.qa.pages.Property;
import com.pdpl.qa.pages.PropertyDetails;
import com.pdpl.qa.pages.Quote;

public class PropertyDetailsPageTest extends TestBase {
	LoginPage loginPage;
	PolicySelection policySelection;
	ApplicantInfo applicantInfo;
	Property property;
	Endorsement endo;
	LossHistoryInfo lhi;
	Quote quote;
	PaymentsOption pay;
	PropertyDetails propdet;
	AI ai;

	public PropertyDetailsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException, AWTException {

		// String data=reader.getCellData("PolicySelectionDetails", 1, 2);
		// System.out.println(data);
		initialization();
		loginPage = new LoginPage();
		policySelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		applicantInfo = policySelection.policyselectiondetails();
		property = applicantInfo.applicantinfo();
		endo = property.proprtyDetails();
		lhi = endo.endorsementDetails();
		quote = lhi.losshistoryInfo();
		pay = quote.quoteRate();
		propdet = pay.payments();
	}

	@Test(priority = 1)
	public void proprtyInfo() throws InterruptedException {
		ai = propdet.proprtyInfo();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
