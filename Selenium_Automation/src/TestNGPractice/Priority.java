package TestNGPractice;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3)
	public void ademo()
	{
		System.out.println("1st demo");
	}
	@Test(priority = 2)
	public void vdemo()
	{
		System.out.println("2nd demo");
	}
	@Test(priority = 1)
	public void fdemo()
	{
		System.out.println("3rd demo");
	}

}
