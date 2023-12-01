package com.leasecrunch.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.locators.ClientListingLocator;

public class ClientListingPage extends Page {

	public ClientListingLocator clp;

	public ClientListingPage() {

		this.clp = new ClientListingLocator();
		PageFactory.initElements(driver, this.clp);
	}

	public void searchbyclientname(String searchbyclient) {

		//clp.search.sendKeys(searchbyclient);
		type(clp.search,searchbyclient);
	}

	public void searchbyfirmname(String searchbyfirm) {
		
		//clp.search.sendKeys(searchbyfirm);
		type(clp.search,searchbyfirm);

	}
}
