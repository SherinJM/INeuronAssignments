package assignment7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * 
Task 4
Open below application
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Enter username as admin and password as admin123 and click on the login button 

Capture the url and verify url contains dashboard

Click on image > Click on Logout
 * 
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String url = driver.getCurrentUrl();
		if (url.contains("dashboard")) {
			System.out.println("Url contains Dashboard");
		}

		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

		List<WebElement> values = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li"));

		for (WebElement element : values) {
			if (element.getText().contains("Logout")) {
				element.click();
			}
		}

		driver.quit();

	}

}
