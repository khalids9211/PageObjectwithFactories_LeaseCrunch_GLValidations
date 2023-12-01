package com.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Page.initConfig(); LoginPage lp = new LoginPage();
		 * lp.loginwithSysAdmin("shah@xdsol.com"); lp.continue_btn(); //
		 * Page.quitBrowser(); FirmPage fp=new FirmPage(); fp.addFirm();
		 * Thread.sleep(3000); //fp.newFirm("Firm1", "Committed", "10"); fp.save_firm();
		 * 
		 * Thread.sleep(3000); fp.searchFirm("Firm1"); Thread.sleep(3000);
		 * 
		 * fp.editFirm();
		 */

		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
	}

}
