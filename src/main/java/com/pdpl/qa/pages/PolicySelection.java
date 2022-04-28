package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;
import com.pdpl.qa.util.Xls_Reader;

public class PolicySelection extends TestBase {

// Page Factory - OR:
	@FindBy(id = "CoCustomerCreateSelectHTML_ActiveControl_DynamicStore_TransTypeCd")
	WebElement transactiontype;
	@FindBy(id = "CoCustomerCreateSelectHTML_lblCoTransTypeCd")
	WebElement tabout;
	@FindBy(id = "CoCustomerCreateSelectHTML_ActiveControl_DynamicStore_PolicyTypeLob")
	WebElement policytype;
	@FindBy(id = "CoCustomerCreateSelectHTML_ActiveControl_DynamicStore_EffectiveDt")
	WebElement effectivedate;
	@FindBy(id = "CoCustomerCreateSelectHTML_DynamicStore_ButtonCreateCustomer")
	WebElement createpolicyBtn;

// Initializing the Page Objects
	public PolicySelection() {
		PageFactory.initElements(driver, this);
	}

// Actions
	public ApplicantInfo policyselectiondetails() throws InterruptedException {
		Xls_Reader r = new Xls_Reader(
				"C:\\Users\\91827\\eclipse-workspace\\PDPL\\src\\main\\java\\com\\pdpl\\qa\\testdata\\PDPL Test Data.xlsx");
		Thread.sleep(3000);
		driver.switchTo().frame("InsDmain");
		drop = new Select(transactiontype);
		drop.selectByValue(r.getCellData("PSD", 0, 2));
		tabout.click();
		drop = new Select(policytype);
		drop.selectByValue(r.getCellData("PSD", 1, 2));
		//effectivedate.sendKeys(r.getCellData("PSD", 2, 2));
		effectivedate.sendKeys("02/24/2022");
		tabout.click();
		createpolicyBtn.click();
		return new ApplicantInfo();
	}
}
