package assignment12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task2 {
	@Parameters("Browser")
	@Test
	public void facebook2(String browserName) {
		WebDriver driver = Utility.startBrowser(browserName, "https://www.facebook.com/");

		Reporter.log("Thread Id: " + Thread.currentThread().getId(),true);
		Reporter.log("Thread Name: " + Thread.currentThread().getName(),true
				);

		List<WebElement> links = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//ul//li"));

		for (WebElement footerLinks : links) {
			//Reporter.log(footerLinks.getText(), true);
			if (footerLinks.getText().contains("Create Page")) {
				footerLinks.click();
				break;
			}

		}
		driver.quit();
	}
}
