package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
         private Properties pro;
	public ConfigDataProvider() throws Exception {
		File src=new File("C:\\Users\\Dell\\eclipse-workspace\\BatchSep_OctDSS\\Config\\Config.Properties");
		FileInputStream file=new FileInputStream(src);
		pro=new Properties();
		pro.load(file);
	}
public String getURL_stage() {
	return pro.getProperty("URL_stage");
}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
}
