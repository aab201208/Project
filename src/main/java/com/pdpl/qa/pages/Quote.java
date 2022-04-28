package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;

public class Quote extends TestBase {
	// Page Factory - OR:
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;
	@FindBy(id = "CoPLRatingHPHTML_ActiveControl_HPPolInput_AllPerilDedAmt")
	WebElement peril;
	@FindBy(id = "CoPLRatingHPHTML_imgRate")
	WebElement rate;

	// Initializing the Page Objects
	public Quote() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public PaymentsOption quoteRate() throws InterruptedException {
		Thread.sleep(4000);
		drop = new Select(peril);
		drop.selectByValue("100");
		rate.click();
		Thread.sleep(6000);
		next.click();
		return new PaymentsOption();
	}
}
