package TestNGPractice;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void demo1()
	{
		System.out.println("1st demo");
	}
	
	@Test(dependsOnMethods = "demo1")
	public void demo2()
	{
		System.out.println("2nd demo");
	}
	@Test(dependsOnMethods = "demo2")
	public void demo3()
	{
		System.out.println("3rd demo");
	}

}
