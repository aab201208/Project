package com.pdpl.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.base.TestBase;

public class Endorsement extends TestBase {
	// Page Factory - OR:

	@FindBy(id = "AppFactoryDynamicWebViewID_scnEndorsements")
	WebElement tabout;
	@FindBy(xpath = "//select[@name='AppFactoryDynamicWebViewID:dgEndorsements_AddDropDown']")
	WebElement endorsement;
	@FindBy(id = "AppFactoryDynamicWebViewID_dgEndorsements_AddButton")
	WebElement addBtn;
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;

	// Initializing the Page Objects
	public Endorsement() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public LossHistoryInfo endorsementDetails() throws InterruptedException {
		Thread.sleep(5000);
		tabout.click();
		drop = new Select(endorsement);
		drop.selectByIndex(14);
		addBtn.click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		next.click();
		return new LossHistoryInfo();
	}
}
