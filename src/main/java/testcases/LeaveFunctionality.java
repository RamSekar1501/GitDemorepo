package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Leave;
import pages.Login;

public class LeaveFunctionality extends Login {

	@Test
	public void runLeaveFunctionality() throws IOException
	{
		LeaveFunctionality lf = new LeaveFunctionality();
		lf.enterUserName().enterPassword().clickLogin().assignLeave();
        
	}
}
