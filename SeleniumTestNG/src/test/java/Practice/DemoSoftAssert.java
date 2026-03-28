package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	
	@Test
	public void demoTest() {
		String actualVal="PECC";
		String expectedVal="PEC";
		
		//soft assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualVal,expectedVal);
		
		if(actualVal.equals(expectedVal)) {
			System.out.println("Status :Passed");
		}
		else {
			System.out.println("Status : Failed");
		}
	}

}
