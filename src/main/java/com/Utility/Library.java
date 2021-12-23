package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Library {

	// common method
	
	public static void custom_Sendkeys(WebElement element,String value,String fieldName) {
		try {
			element.sendKeys(value);
			ObjectRepo.test.log(Status.PASS,fieldName+"=Value succefully send ="+value);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL,"Unable to send Value "+e);
		}		
	}
	public static void custom_Click(WebElement element,String fieldname) {
		try {
			element.click();
			ObjectRepo.test.log(Status.PASS,"Clicked succefully="+fieldname);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL,"unable to click "+e);		
		}
	}
	
}
