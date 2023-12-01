package com.leasecrunch.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.locators.LoginPageLocators;

public class LoginPage extends Page{
	
	public LoginPageLocators lpl;
	
	public LoginPage() {
		
		this.lpl = new LoginPageLocators();
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(driver, this.lpl);
	}
	
	public void continue_btn() {
		
		click(lpl.conti_btn);
	}
	public void loginwithSysAdmin(String emailaddress) {
		
		
		// lpl.email.sendKeys(emailaddress);
		type(lpl.email, emailaddress );
		
	}
	
	public void loginwithFirmAdmin(String emailaddress) {
		
		lpl.email.sendKeys(emailaddress);
	}
	
	public void loginwithFirmUser(String emailaddress) {
		
		lpl.email.sendKeys(emailaddress);
	}
	
	public void loginwithFrimReadonly(String emailaddress) {
		lpl.email.sendKeys(emailaddress);
	}
	
	public void loginwithClientAdmin(String emailaddress) {
		lpl.email.sendKeys(emailaddress);
	}
	
	public void loginwithClientUser(String emailaddress) {
		lpl.email.sendKeys(emailaddress);
	}
	
	public void loginwithClientReadonly(String emailaddress) {
		lpl.email.sendKeys(emailaddress);
	}
	

}
