package com.leasecrunch.pages.actions;

import java.util.Hashtable;
import java.util.Random;

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
	
	public void enableFirm() {
		
		click(fpl.enabled);
	}
	public void includedisableradiobtn() {
		
		click(fpl.firm_includeDisable);
	}
	public void newFirm() {
		
		 Random random = new Random();
		 String name = "Firm"+random.nextInt();
		 
		 System.out.println(name);
		
		//fpl.firmname.sendKeys(name);
		type(fpl.firmname,name);
	//fpl.contractType.sendKeys(contractType);
		type(fpl.contractType, "Committed");
		//fpl.contractPricing.sendKeys(contractpricing);
		type(fpl.contractPricing,  "$30");
		
		
	}
	
	public void editFirmname() {
		Random random = new Random();
		 String name = "Firm"+random.nextInt();
		type(fpl.firmname, name);
		
	}
	public void editFirmContracttype() {
		type(fpl.contractType, "Pay-as-you-go");
	}
	public void save_firm() {
		
		click(fpl.save_btn);
	}

	public void searchfirm(String search) {
		
		type(fpl.firm_search,search);
	}
	
	public String firmsearchresult() {
		
	String	results=fpl.searchresult.getText();
	System.out.println(results);
	return results;
	
	}
	
	public void clickonFirm() {
		
		click(fpl.clickonFirmlink);
	}
}
