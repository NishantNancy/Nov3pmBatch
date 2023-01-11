package TestNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo()
	{
		boolean exepectedData=true;
		boolean actaulData=false;
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actaulData, exepectedData);
		System.out.println("pass");
		s.assertAll();
	}

}
