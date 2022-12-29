/*
 * Task 2
Open below application and verify logo is present or not
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

 * 
 * 
 * 
 * 
 */

package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		boolean present = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		if (present == true) {
			System.out.println("Logo is present");
		}

		driver.quit();
	}

}
