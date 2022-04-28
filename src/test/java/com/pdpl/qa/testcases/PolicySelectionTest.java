package com.pdpl.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.pages.ApplicantInfo;
import com.pdpl.qa.pages.LoginPage;
import com.pdpl.qa.pages.PolicySelection;



public class PolicySelectionTest extends TestBase {
	LoginPage loginPage;
	PolicySelection policySelection;
    ApplicantInfo applicantInfo;
    
  
   public PolicySelectionTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		policySelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void policyselectionDetails() throws InterruptedException{
      
			applicantInfo = policySelection.policyselectiondetails();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
