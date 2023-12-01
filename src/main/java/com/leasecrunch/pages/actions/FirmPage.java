package com.leasecrunch.pages.actions;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.locators.FirmPageLocator;

public class FirmPage extends Page {
	
	public FirmPageLocator fpl;
	
	public FirmPage() {
		
		this.fpl= new FirmPageLocator();
		PageFactory.initElements(driver, this.fpl);
	}
	
	public void searchFirm(String searchkey) {
		
		//fpl.searchfield.sendKeys(searchkey);
		type(fpl.searchfield,searchkey);
	}
	
	public void addFirm() {
		click(fpl.addfirm_btn);
		//fpl.addfirm_btn.click();
	}

	public void exportFirm() {
		
		click(fpl.exportxls_btn);
	}
	
	public void editFirm() {
		
		click(fpl.edit);
	}
	
	public void disableFirm() {
		
		click(fpl.disabled);
	}
	
	public void newFirm(Hashtable<String, String> data) {
		
		
		
		//fpl.firmname.sendKeys(name);
		type(fpl.firmname,data.get("Name"));
	//fpl.contractType.sendKeys(contractType);
		type(fpl.contractType, data.get("CotractType"));
		//fpl.contractPricing.sendKeys(contractpricing);
		type(fpl.contractPricing,  data.get("ContractPricing"));
		
		
	}
	
	public void save_firm() {
		
		click(fpl.save_btn);
	}

}
