package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * 
Task 2
Open below application
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Enter username as admin and click on the login button 

Verify password field is showing the required message.
 * 
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		String text = driver.findElement(By.xpath("//span[text()='Required']")).getText();

		if (text.equalsIgnoreCase("Required")) {
			System.out.println("Message displayed: " + text);
			System.out.println("Password field is showing required message");
		}

		driver.quit();

	}

}
