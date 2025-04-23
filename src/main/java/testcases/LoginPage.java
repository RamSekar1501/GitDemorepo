package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificmethod;
import pages.Login;

public class LoginPage extends ProjectSpecificmethod {
	@Test
	public void runLogin() throws IOException
	{
	Login lp = new Login();
    lp.enterUserName().enterPassword().clickLogin();
	}
	
	@BeforeTest
	public void setValues()
	{
		testName="Login Functionality";
		testDesc = "Validate the login functionality with valid credential";
		author = "TestUser";
		category="Regression";
	}

	
		
}
