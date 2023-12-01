package com.leasecrunch.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement email;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/form/button")
	public WebElement conti_btn;
	
}
