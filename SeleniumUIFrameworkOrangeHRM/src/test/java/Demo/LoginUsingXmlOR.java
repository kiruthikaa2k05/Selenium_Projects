package Demo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	
	@Test
	public void login() throws Throwable, IOException, ParserConfigurationException {
		//read data from xml file
		Document file = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("/SeleniumUIFramework.OrangeHRM/src/main/resources/DemoObjectRepository/LoginPage.xml"));
	    //fetching the string 
		 String username = file.getElementsByTagName("usernamefield").item(0).getTextContent();
		 String passwd = file.getElementsByTagName("password").item(0).getTextContent();
		 String loginButn = file.getElementsByTagName("loginButton").item(0).getTextContent();
		 //spliting the locator and value
		 String userloc = username.split(":")[0];
		 
	
	}

}
