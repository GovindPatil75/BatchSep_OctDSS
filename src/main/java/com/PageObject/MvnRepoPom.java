package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MvnRepoPom {

	  WebDriver driver;
	  
	@FindBy(how=How.XPATH,using="//input[@id='query']")
	private WebElement Search;
	@FindBy(how=How.XPATH,using="//input[@value='Search']")
	private WebElement btn_search; // data hiding
	
	public MvnRepoPom(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}
	
}
