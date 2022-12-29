/*
 * Task 1

Open below application
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Capture the application url and verify url ends with “login”

Capture the application url and verify url contains “demo”

Capture the application title and verify title contains HRM 

 * 
 */

package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		if (url.endsWith("login")) {
			System.out.println("Verified, url ends with Login");
		}

		if (url.contains("demo")) {
			System.out.println("Verified, url contains demo");
		}

		String title = driver.getTitle();
		if (title.contains("HRM")) {
			System.out.println("Verified, title contains HRM");
		}
		driver.quit();
	}

}
