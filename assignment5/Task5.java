/*
 * Task 5
Open the below application and verify the capture all href values from social media icons. Run a loop and verify if any url contains youtube. If youtube found then break the loop.
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

 * 
 * 
 */

package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		List<WebElement> allHref = driver.findElements(By.tagName("a"));
		for (WebElement links : allHref) {
			String hrefValue = links.getAttribute("href");
			if (hrefValue.contains("youtube")) {
				System.out.println("Found Youtube");
				break;
			}

		}
		driver.quit();

	}

}
