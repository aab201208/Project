package com.pdpl.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdpl.qa.base.TestBase;

public class PropertyDetails extends TestBase {
	// Page Factory - OR:
	@FindBy(xpath = "//a//span[text()='ext']")
	WebElement next;
	@FindBy(xpath = "//span[text()='Is there a swimming pool?']")
	WebElement tabout;
	@FindBy(xpath = "//span//select[@onhelp='try {OnHelpDR(this)} catch(e) {}']")
	WebElement swim;

	// Initializing the Page Objects
	public PropertyDetails() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public AI proprtyInfo() throws InterruptedException {
		Thread.sleep(4000);
		tabout.click();
		/*drop = new Select(swim);
		drop.selectByValue("NO");*/
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();	
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).sendKeys("200").build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.TAB).sendKeys("300").build().perform();
		next.click();
		return new AI();
	}
}
