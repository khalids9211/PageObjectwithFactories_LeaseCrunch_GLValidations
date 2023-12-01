package com.leasecrunch.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.leasecrunch.base.Page;

import com.leasecrunch.pages.locators.HomePageLocator;

public class HomePage extends Page {

	public HomePageLocator hpl;

	public HomePage() {

		this.hpl = new HomePageLocator();
		PageFactory.initElements(driver, this.hpl);
	}

	public void Firm_tab() {
		click(hpl.firm_tab);
	}
	
	public void Client_tab() {
		
		click(hpl.client_tab);
	}
	
	public void Signout() {
		click(hpl.dropdown);
		click(hpl.sign_out);
	}
}
