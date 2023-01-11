package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo()
	{
		String exepectedData="abc";
		String actualData="abc";
		
		Assert.assertEquals(actualData, exepectedData);
		System.out.println("Pass");
	}

}
