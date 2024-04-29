package com.leasecrunch.testscases.Firm;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.LoginPage;

public class EnableFirm {
	
	
	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}
	@Test
	public void enableFirm() throws InterruptedException {
		
		LoginPage lp = new LoginPage();
		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();

		FirmPage fp = new FirmPage();
		fp.includedisableradiobtn();
		Thread.sleep(2000);	
		fp.editFirm();
		Thread.sleep(2000);
		
		fp.enableFirm();

		Thread.sleep(2000);
		
		fp.save_firm();
		
		
	}

	@AfterTest
	public void aftertest() {
		if (Page.driver != null) {
		//	Page.quitBrowser();
		}
	}
}
