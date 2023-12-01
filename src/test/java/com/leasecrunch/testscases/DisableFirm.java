package com.leasecrunch.testscases;

import java.util.Hashtable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.HomePage;
import com.leasecrunch.pages.actions.LoginPage;
import com.leasecrunch.utilities.Utility;

public class DisableFirm {

	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}
	
	@Test(dataProviderClass=Utility.class,dataProvider="dp")
	public void disableFirm (Hashtable<String,String>data) throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.loginwithSysAdmin(data.get("username"));
		lp.continue_btn();
		// Page.quitBrowser();
		
			FirmPage fp = new FirmPage();

			fp.searchFirm("Firm1");
			Thread.sleep(2000);
			
			fp.editFirm();

			Thread.sleep(3000);
			fp.disableFirm();
			fp.save_firm();
			HomePage hp= new HomePage();
			Thread.sleep(10000);
			hp.Signout();
			
		

			
	}

	@AfterTest
	public void aftertest() {
		//Page.quitBrowser();
		}
}
