package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups="smoke")
	public void login()
	{
		System.out.println("Logged in succesfully");
	}
	@Test(groups="regression")
	public void search()
	{
		System.out.println("product found");
	}

	@Test(groups="regression")
	public void select()
	{
		System.out.println("product has been selected");
	}

	@Test(groups="regression")
	public void addToCart()
	{
		System.out.println("product added");
	}
	
	@Test(groups="regression")
	public void payment()
	{
		System.out.println("payment made");
	}
	@Test(groups="smoke")
	public void logout()
	{
		System.out.println("logout");
		
	}

}
