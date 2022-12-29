/*
 * Task 3
Open below application and verify that footer has 4 social media icons
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

 */

package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		int totalNoOfLinks = allLinks.size();
		if (totalNoOfLinks == 4) {
			System.out.println("Yes, Footer has 4 Social media icons");
		}

	}

}
