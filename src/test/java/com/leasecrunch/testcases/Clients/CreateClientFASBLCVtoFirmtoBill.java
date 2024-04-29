package com.leasecrunch.testcases.Clients;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.ClientPage;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.LoginPage;

public class CreateClientFASBLCVtoFirmtoBill extends Page {

	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}

	@Test
	public void createFASBClientLCVtoFirmtoBill() throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();

		FirmPage fp = new FirmPage();
		fp.searchfirm("Firm 1.28");
		Thread.sleep(5000);
		fp.clickonFirm();
		Thread.sleep(3000);
		ClientPage cp = new ClientPage();
		// cpl.searchClient("FASB");

		cp.addClient();
		Thread.sleep(2000);
		  Actions action = new Actions(driver); 
		  action.sendKeys(Keys.PAGE_DOWN).perform();
		  
		cp.typeclientname("FASBClient");
		cp.typedescription("FASB Client Description");
		cp.selectfasbaccountingstandard();
		cp.lcproductleasecrunch();
		cp.contracttypepayasyougo();
		cp.contractpricing("$100");
		//	cp.clientaccessallcustom();
		cp.saveclient();
		//cp.cancelclient();
		Thread.sleep(5000);
	}

	@AfterTest
	public void aftertest() {
		// Page.quitBrowser();
	}
}
