package base;

import org.testng.annotations.Test;

public class LearnGroup {

	@Test(groups="functional")
	public void runLogin()
	{
		System.out.println("Login into application");
	}

	@Test(groups="functional")
	public void adminCreate()
	{
		System.out.println("created succeddfully");
	}

	@Test(groups="sanity")
	public void adminEdit()
	{
		System.out.println("edited succeddfully");
	}
	@Test(groups="regression")
	public void adminDelete()
	{
		System.out.println("Deleted succeddfully");
	}
}
