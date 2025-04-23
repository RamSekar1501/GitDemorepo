package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Login;

public class TimeFunctionality extends Dashboard {
		
		@Test
		public void runTimeFunctionality() throws IOException
		{

			TimeFunctionality tf = new TimeFunctionality();
			tf.enterUserName().enterPassword().clickLogin().time().punchIN();
		}
		

	}


