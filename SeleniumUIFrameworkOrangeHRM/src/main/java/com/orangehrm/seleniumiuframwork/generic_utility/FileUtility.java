package com.orangehrm.seleniumiuframwork.generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	Properties prop;
	FileInputStream fis;
	FileOutputStream fos;
	
	//Read the data
	public String getPropertyKeyValue(String key) throws IOException {
		fis=new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
		prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;	
	}
	
	//Write the data
	public void  setPropertyPair(String key,String value) throws IOException {
		prop=new Properties();
		prop.setProperty(key, value);
		fos=new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/write.properties");
		prop.store(fos,"Updated Common Data");
		fos.close();	
	}
	
	

}
