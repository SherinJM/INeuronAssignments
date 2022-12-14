package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * 
Task 3
Open below application
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Enter username as admin and password as mukesh and click on the login button 

Capture error message and verify message contains Invalid credentials

 * 
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String text = driver.findElement(By.xpath("//div[@class='oxd-alert oxd-alert--error']")).getText();

		if (text.contains("Invalid credentials")) {
			System.out.println("Yes, error message contains 'Invalid Credentials'");
		}
		driver.quit();

	}

}
