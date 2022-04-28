package com.pdpl.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.util.Xls_Reader;

public class ApplicantInfo extends TestBase {
// Page Factory - OR:
	// Applicant
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_SalutationTx")
	WebElement salutationapp1;
	@FindBy(xpath = "//input[@name='AppFactoryDynamicWebViewID:ActiveControl_CoInsuredInfo_FirstNm1Tx']")
	WebElement fnameapp1;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_LastNm1Tx")
	WebElement lnameapp1;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_NameSuffix1Tx")
	WebElement suffixapp1;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_DOB1Dt")
	WebElement dob;
	// Co-applicant
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoTPInfo_CoAppInd")
	WebElement coappchoice;
	@FindBy(id = "AppFactoryDynamicWebViewID_lblCoApplicant")
	WebElement tabout;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_Salutation2Tx")
	WebElement salutationapp2;
	@FindBy(xpath = "//input[@name='AppFactoryDynamicWebViewID:ActiveControl_CoInsuredInfo_FirstNm2Tx']")
	WebElement fnameapp2;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_LastNm2Tx")
	WebElement lnameapp2;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_NameSuffix2Tx")
	WebElement suffixapp2;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_InsuredTypeCd")
	WebElement insuredtype;
	// Mailing Address
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_AddrLine1Tx")
	WebElement addressline1;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_CityNm")
	WebElement city;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_ZipCd")
	WebElement zipcode;
	// Contact Info
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_PreferredContactCd")
	WebElement contact;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_OtherPhone3No")
	WebElement phoneno;
	// Other Info
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_OccupationTx")
	WebElement occupation;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_EmployerTx")
	WebElement employer;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInsuredInfo_MaritalStatusCd")
	WebElement maritalstatus;
	// Policy type
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPolInput_HOFormCd")
	WebElement ptype;
	// Community
	@FindBy(id = "AppFactoryDynamicWebViewID_CommunityServicePopUp")
	WebElement community;
	// Next
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;

	@FindBy(linkText = "Save & Close")
	WebElement link;

// Initializing the Page Objects
	public ApplicantInfo() {
		PageFactory.initElements(driver, this);
	} 

// Actions
	public Property applicantinfo() throws InterruptedException, AWTException {
		Xls_Reader r = new Xls_Reader(
				"C:\\Users\\91827\\eclipse-workspace\\PDPL\\src\\main\\java\\com\\pdpl\\qa\\testdata\\PDPL Test Data.xlsx");
		// Applicant Info
		Thread.sleep(3000);
		drop = new Select(salutationapp1);
		drop.selectByValue(r.getCellData("Ainfo", 0, 2));
		Thread.sleep(1000);
		fnameapp1.sendKeys(r.getCellData("Ainfo", 1, 2));
		lnameapp1.sendKeys(r.getCellData("Ainfo", 2, 2));
		drop = new Select(suffixapp1);
		drop.selectByValue(r.getCellData("Ainfo", 3, 2));
		dob.sendKeys(r.getCellData("Ainfo", 4, 2));
		drop = new Select(coappchoice);
		drop.selectByValue(r.getCellData("Ainfo", 5, 2));
		tabout.click();
		drop = new Select(salutationapp2);
		Thread.sleep(1000);
		drop.selectByValue(r.getCellData("Ainfo", 6, 2));
		Thread.sleep(1000);
		fnameapp2.sendKeys(r.getCellData("Ainfo", 7, 2));
		lnameapp2.sendKeys(r.getCellData("Ainfo", 8, 2));
		drop = new Select(suffixapp2);
		drop.selectByValue(r.getCellData("Ainfo", 9, 2));
		drop = new Select(insuredtype);
		drop.selectByValue(r.getCellData("Ainfo", 10, 2));
		tabout.click();
		// Mailing address
		addressline1.sendKeys(r.getCellData("Ainfo", 11, 2));
		city.sendKeys(r.getCellData("Ainfo", 12, 2));
		zipcode.sendKeys("93514");
		// Contact Info
		drop = new Select(contact);
		drop.selectByValue(r.getCellData("Ainfo", 14, 2));
		phoneno.sendKeys("2222222212");
		// Other Info
		drop = new Select(occupation);
		drop.selectByValue(r.getCellData("Ainfo", 16, 2));
		employer.sendKeys(r.getCellData("Ainfo", 17, 2));
		drop = new Select(maritalstatus);
		drop.selectByValue(r.getCellData("Ainfo", 18, 2));
		drop = new Select(ptype);
		drop.selectByValue("HO3");
		tabout.click();
		community.click();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		Robot robot = new Robot();
		robot.delay(1000);
		robot.mouseMove(300, 80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(8000);
		next.click();
		return new Property();
	}
}
