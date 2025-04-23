package base;

import org.testng.annotations.Test;

public class CreateAdmin {

	@Test
	public void runCreateAdmin()
	{
		System.out.println("Admin created successfully");
		throw new RuntimeException("Unknown error");
	}
}
