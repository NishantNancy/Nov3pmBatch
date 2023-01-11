package TestNGPractice;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("login the page");
	}
	@Test(groups = "regression")
	public void search()
	{
		System.out.println("search the page");
	}
	@Test(groups = "regression")
	public void select()
	{
		System.out.println("select the product");
	}
	@Test(groups = "regression")
	public void addtocart()
	{
		System.out.println("addtocart the product");
	}
	@Test(groups = "smoke")
	public void payment()
	{
		System.out.println("payment the product");
	}

}
