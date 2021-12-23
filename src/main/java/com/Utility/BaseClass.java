package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	// Browser Open----Close 
	
@BeforeSuite
public void BS() throws Exception {
	 config=new ConfigDataProvider();
	 excel=new ExcelDataProvider();
	 
}
@Parameters({"Browser"})	
@BeforeMethod
public void LaunchBrowser(String Browser) {
	if(Browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getURL_stage());	
	}
	else if(Browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(config.getURL_stage());
	}
		driver.manage().window().maximize();	
}
@AfterMethod
public void TearDown() {
	driver.quit();
}
}
