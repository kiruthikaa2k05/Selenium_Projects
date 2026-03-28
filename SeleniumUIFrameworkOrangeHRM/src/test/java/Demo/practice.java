package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class practice {
	@Test
	public void readData() throws  IOException {
		//1.converting physical file into java file
	  FileInputStream fis= new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
	  Properties prop=new Properties();
	  //loading the files using  file handling
	  prop.load(fis);
	  String URL = prop.getProperty("url");//return type is string
	  String browser = prop.getProperty("browser");//getting browser
	  String username = prop.getProperty("username");//getting username
	  String password = prop.getProperty("password");//getting password
	  System.out.println("The dafault browser for testing is :"+ URL);
	  System.out.println("The URL of the application for testing is :"+ browser);
	  System.out.println("The valid username of the appliaction  for testing is :"+ username);
	  System.out.println("The valid passwordof the application for testing is :"+ password);
	  
	  //write
	  FileOutputStream fos=new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/write.properties");
	  prop.setProperty("CandidateName","Eloise");
	  prop.store(fos,null);
	  
	  
	  
	  
	  
	  
	  
	  
	}


}
