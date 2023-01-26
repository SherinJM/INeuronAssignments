package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task1 {
	@Parameters("Browser")
	@Test
	public void facebook1(String browserName) {
		WebDriver driver = Utility.startBrowser(browserName, "https://www.facebook.com/");

		Reporter.log("Thread Id: " + Thread.currentThread().getId(),true);
		Reporter.log("Thread Name: " + Thread.currentThread().getName(),true);
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = element.getText();
		Reporter.log("Printing the text: " + text, true);
		String msg = "Facebook helps you connect and share with the people in your life.";

		// Verifying the text
		Assert.assertTrue(text.equalsIgnoreCase(msg));

		driver.quit();
	}
}
