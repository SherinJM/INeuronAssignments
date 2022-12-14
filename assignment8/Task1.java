package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Task 1
Open https://www.facebook.com/

Capture the below text and verify text contains the below text

Facebook helps you connect and share with the people in your life

 * 
 */

public class Task1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = element.getText();
		System.out.println("Printing the text: " + text);

		// Verifying the text
		if (text.equalsIgnoreCase("Facebook helps you connect and share with the people in your life.")) {
			System.out.println("Verified, same text message");
		}

		driver.quit();
	}

}
