package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leave extends Dashboard{
	public Leave assign() {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	return new Leave();
	}
	
		

	}


