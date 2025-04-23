package base;

import org.testng.annotations.Test;

public class LearnGroupFeature {
	@Test(groups="functional")
	public void Login()
	{
		System.out.println("Login into application");
	}

	@Test(groups="functional")
	public void Create()
	{
		System.out.println("created succeddfully");
	}

	@Test(groups="sanity")
	public void Edit()
	{
		System.out.println("edited succeddfully");
	}
	@Test(groups="regression", dependsOnMethods = { "functional" })
	public void Delete()
	{
		System.out.println("Deleted succeddfully");
	}
}
