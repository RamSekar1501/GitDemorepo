package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificmethod;
import pages.Login;

public class Dashboard extends Login {
	@Test
	public void runDashboard() throws IOException
	{
		Dashboard dp = new Dashboard();
		dp.enterUserName().enterPassword().clickLogin().time();
        
	}
	

}
