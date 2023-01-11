package TestNGPractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssest {
	
	@Test
	public void demo()
	{
		String exepecteddata = "abc";
		String actualdata = "abc";
		
		Assert.assertEquals(exepecteddata, actualdata);
		
		System.out.println("Pass");
		
	}

}
