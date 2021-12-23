package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.MvnRepoPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_Login extends BaseClass{

	@Test
	public void Verify_tc_001() {
		MvnRepoPom mvnrepopage=PageFactory.initElements(driver, MvnRepoPom.class);
		Library.custom_Sendkeys(mvnrepopage.getSearch(), excel.getStringData("Sheet1", 0, 0), "SearchBar");	
		Library.custom_Click(mvnrepopage.getBtn_search(), "Search Button");
	
		
		String data=excel.getNumericData("Sheet1", 2, 0); //1234567.0
		System.out.println(data);
	}
}
