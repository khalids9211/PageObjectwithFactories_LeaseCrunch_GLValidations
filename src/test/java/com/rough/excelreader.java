package com.rough;

import com.leasecrunch.utilities.ExcelReader;

public class excelreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelReader excel= new ExcelReader((System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\logintestdata-Copy.xlsx"));
		int rows = excel.getRowCount(Constants.datasheet);
		System.out.println("Total number of data rows in test sheets are "+rows);
	
		String testname="CreateClientTest_FASB";
		
		int testcasestartsfromrow= 1;
		for(testcasestartsfromrow=1; testcasestartsfromrow<= rows; testcasestartsfromrow++) {
			
			excel.getCellData(Constants.datasheet, 0, testcasestartsfromrow);
			
			String testcasename=excel.getCellData(Constants.datasheet, 0, testcasestartsfromrow);
			//System.out.println(testcasename);
			
			if (testcasename.equalsIgnoreCase(testname))
				break;
		}
		
		System.out.println("Test case"+testname+" start from row"+testcasestartsfromrow);
		
		// checking total number of rows in single test case
		
		int tcdatastartrow=testcasestartsfromrow+2;
		int tcrows=0;
		
		while(!excel.getCellData(Constants.datasheet, 0, tcdatastartrow+tcrows).equals("")) {
			tcrows++;
		}
		
		System.out.println("total number of rows in single test case "+tcrows);
		// checking total number of column in single test case
		int colstartforsingletest = testcasestartsfromrow+1;
		int tccol=0;
		while(!excel.getCellData(Constants.datasheet, tccol, colstartforsingletest).equals("")) {
			tccol++;
	
		}
		System.out.println("total column in single tests are "+tccol);
		
		// printing data for single test cases
		
		for(int rnum=tcdatastartrow; rnum<tcdatastartrow+tcrows; rnum++) {
			
			for(int cnum=0; cnum<tccol; cnum++) {
				
				System.out.println(""+ excel.getCellData(Constants.datasheet, cnum, rnum));
			}
		}
		
	}
}
