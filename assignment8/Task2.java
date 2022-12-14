package assignment8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Task 2
Open https://www.facebook.com/ 
Capture all link text available in the footer section and verify Create Page Link is present or not. If yes then click on it.
 * 
 */

public class Task2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//ul//li"));

		for (WebElement footerLinks : links) {
			if (footerLinks.getText().contains("Create Page")) {
				footerLinks.click();
			}
		}
		driver.quit();
	}
}
