package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdpl.qa.base.TestBase;

public class AI extends TestBase {// Page Factory - OR:
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;

	// Initializing the Page Objects
	public AI() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void addInt() throws InterruptedException {
		Thread.sleep(4000);
		next.click();
		}

}
