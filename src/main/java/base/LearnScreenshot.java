package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
	   ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		    WebElement username = driver.findElement(By.name("username"));
		    username.sendKeys("Admin");
			//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		    File screenshotAs = username.getScreenshotAs(OutputType.FILE);
			File destinationFile= new File("./snap/shot.jpg");//empty
			FileUtils.copyFile(screenshotAs, destinationFile);

	}

}
