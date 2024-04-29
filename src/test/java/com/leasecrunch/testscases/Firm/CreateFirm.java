package com.leasecrunch.testscases.Firm;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.errorcollectors.ErrorCollector;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.HomePage;
import com.leasecrunch.pages.actions.LoginPage;
import com.leasecrunch.utilities.Utility;

public class CreateFirm {

	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}

	@Test()
	public void createFirm() throws InterruptedException {

		LoginPage lp = new LoginPage();

		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();
		Thread.sleep(3000);
		FirmPage fp = new FirmPage();
		fp.addFirm();
		Thread.sleep(3000);
		fp.newFirm();

		fp.save_firm();

		/*
		 * HomePage hp= new HomePage();
		 * 
		 * Thread.sleep(10000); hp.Signout();
		 */

	}

	@AfterTest
	public void aftertest() {
		if (Page.driver != null) {
			 Page.quitBrowser();
		}
	}

}
