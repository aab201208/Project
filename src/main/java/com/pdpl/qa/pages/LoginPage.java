package com.pdpl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdpl.qa.base.TestBase;

public class LoginPage extends TestBase {
//Page Factory - OR:
	@FindBy(name = "txtUserName")
	WebElement username;

	@FindBy(name = "txtPassword")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement loginBtn;

//Initializing the Page Objects	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//Actions
	public PolicySelection login(String un, String pwd) {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();

		return new PolicySelection();
	}
}
