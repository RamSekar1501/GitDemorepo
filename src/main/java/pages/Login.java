package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificmethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends ProjectSpecificmethod{

	//action 1
	//@Given("Enter the username")
			public Login enterUserName() throws IOException
			{
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
				try {
					driver.findElement(By.name("username")).sendKeys("Admin");
					reportStep("pass","Username is entered successfully");
				} catch (Exception e) {
					reportStep("fail","Username is not entered successfully");
				}
				return this;
			}
			//action 2
//@Given("Enter the password")
			public Login enterPassword() throws IOException
			{
				try {
					driver.findElement(By.name("password")).sendKeys("admin123");
					reportStep("pass", "Password is entered successfully");
				} catch (Exception e) {
					 reportStep("fail", "Password is not entered successfully");
				}
				return this;
			}

	    //action 3
     //@When("click on the Login button")
			public Dashboard clickLogin()
			{
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Dashboard dp= new Dashboard();
				return dp;
				
			}
     @Then("Dashboard page is displayed")
     public void verifypageTitle()
    	 {
    	 
    			System.out.println("Title of the page" + driver.getTitle());
    			String title = driver.getTitle();
    			//Assert.assertEquals("pageOrangeHRM",title);
    			SoftAssert softassert = new SoftAssert();
    			softassert.assertEquals("pageOrangeHRM",title);
    		}
     
}
