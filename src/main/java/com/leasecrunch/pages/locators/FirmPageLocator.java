package com.leasecrunch.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirmPageLocator {
	
	
	@FindBy(xpath="//*[@id=\"filterInput\"]")
	public WebElement searchfield;
	
	@FindBy(xpath="//*[@id=\"addFirmButton\"]")
	public WebElement addfirm_btn;
	
	@FindBy(xpath="//*[@id=\"ExportExcel\"]")
	public WebElement exportxls_btn;

	@FindBy(xpath="//input[@id='filterInput']")
	public WebElement firm_search;
	
	@FindBy(xpath="//input[@id='includeDisabledFirms']")
	public WebElement firm_includeDisable;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	public WebElement searchresult;
	
	@FindBy(xpath="//*[@id=\"FirmList\"]/tbody/tr[1]/td[6]/i")
	public WebElement edit;
	
	@FindBy(xpath="//*[@id=\"FirmList\"]/tbody/tr[1]/td[1]/a")
	public WebElement clickonFirmlink;
	
	@FindBy(xpath="//*[@id=\"firmDisabled\"]/div/div/label[2]")
	public WebElement disabled;
	
	@FindBy(xpath="//label[normalize-space()='Enabled']")
	public WebElement enabled;
	
	// locators for add firm
	
	@FindBy(xpath="//*[@id=\"Name\"]")
	public WebElement firmname;
	
	@FindBy(xpath="//*[@id=\"ContractType\"]")
	public WebElement contractType;
	
	@FindBy(xpath="//*[@id=\"ContractPricing\"]")
	public WebElement contractPricing;
	
	@FindBy(xpath="//*[@id=\"browseButton\"]")
	public WebElement browseFirmlogo_btn;
	
	@FindBy(xpath="//*[@id=\"addFirmModalFormSave\"]")
	public WebElement save_btn;
	
	@FindBy(xpath="//*[@id=\"addFirmModalFormCancel\"]")
	public WebElement cancel_btn;

	

	
	
}
