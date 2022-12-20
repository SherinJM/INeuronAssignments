package assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Task 1
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login


Try to use contains , xpath axes, text functions

Write a minimum 3 XPath and 3 CSS Selector for the username 

Write a minimum 3 XPath and 3 CSS Selector for the password

Write a minimum 3 XPath and 3 CSS Selector for the login button  
*/

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// XPath for username
//		1. //input[@name='username']
//		2. //input[@placeholder='Username']
//		3. //label[contains(text(),'Username')]//following::input[@name='username']

		// CSS Selector for username
//		1. input[name='username']
//		2. input[placeholder='Username']
//		3. div[class='oxd-form-row'] div:nth-child(2)>input

		// XPath for password
//		1. //input[@name='password']
//		2. //input[@placeholder='Password']
//		3. //input[@type='password']

		// CSS Selector for password
//		1. input[name='password']
//		2. input[placeholder='Password']
//		3. input[type='password']

		// XPath for login button
//		1. //button[@type='submit'] 
//		2. //button[text()=' Login ']
//		3. //div[@class='oxd-form-actions orangehrm-login-action']//following::button

		// CSS Selector for login button
//		1. button[type='submit'] 
//		2. div[class='oxd-form-actions orangehrm-login-action'] button
//		3. button[type*='sub']

	}

}
