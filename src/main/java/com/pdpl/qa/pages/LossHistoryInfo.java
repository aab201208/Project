package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pdpl.qa.base.TestBase;

public class LossHistoryInfo extends TestBase {
	// Page Factory - OR:
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;

	// Initializing the Page Objects
	public LossHistoryInfo() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public Quote losshistoryInfo() throws InterruptedException {
		Thread.sleep(4000);
		next.click();
		return new Quote();
	}
}
