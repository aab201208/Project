package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.util.Xls_Reader;

public class PaymentsOption extends TestBase {
	// Page Factory - OR:
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;
	@FindBy(xpath = "//span[text()='Pay Plan:']")
	WebElement tabout;
	@FindBy(id = "AppFactoryDynamicWebViewID_ActiveControl_CoInstallment_PayPlanCd")
	WebElement payplan;

	// Initializing the Page Objects
	public PaymentsOption() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public PropertyDetails payments() throws InterruptedException {
		Xls_Reader r = new Xls_Reader(
				"C:\\My Data\\Ritu\\Essay\\Bama\\PDPL\\src\\main\\java\\com\\pdpl\\qa\\testdata\\PDPL Test Data.xlsx");
		Thread.sleep(8000);
		tabout.click();
		drop = new Select(payplan);
		drop.selectByValue("01");
		next.click();
		return new PropertyDetails();
	}
}
