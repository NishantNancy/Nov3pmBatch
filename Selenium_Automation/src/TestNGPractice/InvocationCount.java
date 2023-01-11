package TestNGPractice;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void demo()
	{
		System.out.println("The demo is");
	}

}
