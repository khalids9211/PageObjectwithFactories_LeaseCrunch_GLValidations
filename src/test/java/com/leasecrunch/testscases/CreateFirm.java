package com.leasecrunch.testscases;

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
	   

	@Test(dataProviderClass = Utility.class, dataProvider = "dp")
	public void createFirm(Hashtable<String, String> data) throws InterruptedException {
		
		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the Test as Runmode set to N");
		}
		Page.initConfig();
		LoginPage lp = new LoginPage();
		
		
		
		  System.out.println(data.get("username"));
		  System.out.println(data.get("Name"));
		 
		 
		lp.loginwithSysAdmin(data.get("username"));
		lp.continue_btn();
		Thread.sleep(3000);
		FirmPage fp = new FirmPage();
		fp.addFirm();
		Thread.sleep(3000);
		fp.newFirm(data);
		fp.save_firm();
		ErrorCollector.verifyEquals(false, false);
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
