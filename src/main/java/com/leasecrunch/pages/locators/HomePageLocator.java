package com.leasecrunch.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[1]/a")
	public WebElement firm_tab;
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[2]/a")
	public WebElement client_tab;
	
	// drop down
	@FindBy(xpath="/html/body/div[1]/header/nav/div/div/div[2]/ul/li[3]/a/span[1]")
	public WebElement dropdown;
	
	@FindBy(xpath="/html/body/div[1]/header/nav/div/div/div[2]/ul/li[3]/ul/li/a")
	public WebElement sign_out;

}
