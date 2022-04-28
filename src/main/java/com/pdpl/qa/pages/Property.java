package com.pdpl.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.util.Xls_Reader;

public class Property extends TestBase {
	// Page Factory - OR:
	@FindBy(id = "AppFactoryDynamicWebViewID_lblYearBuilt")
	WebElement tabout;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_YrBuilt")
	WebElement year;
	@FindBy(id = "AppFactoryDynamicWebViewID_CityFileLookupSL1_CityImage")
	WebElement cityhelp;
	/*
	 * @FindBy(id =
	 * "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_ProtClassCd")
	 * WebElement protcd;
	 * 
	 * @FindBy(id =
	 * "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_BCEGCd") WebElement
	 * bceCD;
	 */
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_ReplacementAmt")
	WebElement replAmt;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_SqFeet")
	WebElement sqfeet;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_RoofTypeCd")
	WebElement roofCd;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_PlumbingCd")
	WebElement plumbingCd;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_ElectricalCd")
	WebElement elecCd;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_HeatTypeCd")
	WebElement heatCd;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_StoriesCd")
	WebElement storiesCd;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_NoOfFamiliesCt")
	WebElement families;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_ProtDeviceLocalCd")
	WebElement protDevice;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_ApplCrimeInd")
	WebElement applCrime;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_StructConvInd")
	WebElement structConv;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_HPPropertyInput_UncorrectedCodeInd")
	WebElement uncorrectedCode;
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;

	// Initializing the Page Objects
	public Property() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public Endorsement proprtyDetails() throws InterruptedException, AWTException {
		Xls_Reader r = new Xls_Reader(
				"C:\\Users\\91827\\eclipse-workspace\\PDPL\\src\\main\\java\\com\\pdpl\\qa\\testdata\\PDPL Test Data.xlsx");
		Thread.sleep(7000);
		tabout.click();
		tabout.click();
		Thread.sleep(6000);
		year.sendKeys(r.getCellData("PropD", 0, 2));
		tabout.click();
		cityhelp.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.delay(1000);
		robot.mouseMove(122, 249);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		/*
		 * protcd.sendKeys("02"); bceCD.clear(); bceCD.sendKeys("02");
		 */
		replAmt.sendKeys("340000");
		sqfeet.sendKeys(r.getCellData("PropD", 2, 2));
		drop = new Select(roofCd);
		drop.selectByValue(r.getCellData("PropD", 3, 2));
		tabout.click();
		Thread.sleep(3000);
		drop = new Select(plumbingCd);
		drop.selectByValue(r.getCellData("PropD", 4, 2));
		tabout.click();
		Thread.sleep(3000);
		drop = new Select(elecCd);
		drop.selectByValue(r.getCellData("PropD", 5, 2));
		tabout.click();
		drop = new Select(heatCd);
		drop.selectByValue(r.getCellData("PropD", 6, 2));
		drop = new Select(storiesCd);
		drop.selectByValue(r.getCellData("PropD", 7, 2));
		drop = new Select(families);
		drop.selectByValue(r.getCellData("PropD", 8, 2));
		drop = new Select(protDevice);
		drop.selectByValue(r.getCellData("PropD", 9, 2));
		drop = new Select(applCrime);
		drop.selectByValue(r.getCellData("PropD", 10, 2));
		drop = new Select(structConv);
		drop.selectByValue(r.getCellData("PropD", 11, 2));
		drop = new Select(uncorrectedCode);
		drop.selectByValue(r.getCellData("PropD", 12, 2));
		next.click();
		return new Endorsement();
	}
}
