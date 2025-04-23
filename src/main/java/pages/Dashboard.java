package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificmethod;

public class Dashboard extends ProjectSpecificmethod{

	public Time time()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='oxd-icon bi-stopwatch']")));
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-stopwatch']")).click();
		return new Time();
	}
	public Time assignLeave() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Assign Leave']")));
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		return new Time();
	}
	
	
}
