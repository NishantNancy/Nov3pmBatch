package TestNGPractice;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo()
	{
		boolean exepecteddata = true;
		boolean actauldata = false;
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertNotEquals(exepecteddata, actauldata);
		
		System.out.println("Pass");
		s.assertAll();
		
		
	}

}
