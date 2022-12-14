package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * 
 * Task 1
Open below application
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Click on login button (No need to enter login details)

Verify required fields present for username and password

Verify that username and password have border of 1px.
Note- use getCssProperty to fetch css details

 * 
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		boolean bolUsername = driver.findElement(By.xpath("(//span[text()='Required'])[1]")).isDisplayed();

		if (bolUsername == true) {
			System.out.println("Username field is present");
		}

		boolean bolPassword = driver.findElement(By.xpath("(//span[text()='Required'])[2]")).isDisplayed();

		if (bolPassword == true) {
			System.out.println("Password field is present");
		}

		String userNameBorderLength = driver.findElement(By.xpath("//input[@name='username']"))
				.getCssValue("border-radius");

		if (userNameBorderLength.equals("1")) {
			System.out.println("Username border is 1px");
		} else {
			System.out.println("Username border is:" + userNameBorderLength);

		}

		String passwordBorderLength = driver.findElement(By.xpath("//input[@name='password']"))
				.getCssValue("border-radius");

		if (passwordBorderLength.equals("1")) {
			System.out.println("Password border is 1px");
		} else {
			System.out.println("Password border is:" + userNameBorderLength);

		}

		driver.quit();

	}

}
