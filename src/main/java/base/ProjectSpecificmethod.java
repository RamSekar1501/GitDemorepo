package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificmethod{
	public static ExtentReports extent;
    public String testName,testDesc,author,category;
    public static ExtentTest createTest,node;
	public static ChromeDriver driver;
	@BeforeMethod
	public void preCondition(){
		//node createNode = createTest.createNode(testName);
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@BeforeSuite
	public void startReport()
	{
		ExtentSparkReporter report = new ExtentSparkReporter("./reports/result.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	@BeforeClass
	public void testDetails()
	{
		createTest = extent.createTest(testName, testDesc);
		createTest.assignAuthor(author);
		createTest.assignCategory(category);
	}
	public void reportStep(String status,String message) throws IOException
	{
		if(status.equalsIgnoreCase("pass"))
		{
			createTest.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shot"+takeSnap()+".JPG").build());
		
		}
		else if(status.equalsIgnoreCase("fail"))
		{
			createTest.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shot"+takeSnap()+".JPG").build());
		}
	
	}
	public int takeSnap() throws IOException
	{
		int random =(int)(Math.random()*999);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	    File destinationFile= new File("./snap/shot"+random+".jpg");//empty
		FileUtils.copyFile(screenshotAs, destinationFile);
		return random;
	}
		/*
	@AfterMethod
	public void postCondition() {
		driver.close();
		
		
	}*/
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	}


