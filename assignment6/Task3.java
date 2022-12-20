package assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Task 3
Write a script that should be able to add user > search user > delete the user.

Flow- Login > Admin> Add User> Search User > Delete User > Logout

Add an assertion after each section

https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Admin/admin123

 
 */

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']//li"));

		try {
			for (WebElement elements : options) {
				if (elements.getText().contains("Admin")) {
					elements.click();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.findElement(By.xpath("//button[text()=' Add ']")).click();

		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		List<WebElement> userRoles = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));

		for (WebElement roles : userRoles) {
			System.out.println(roles.getText());
			if (roles.getText().contains("ESS")) {
				roles.click();
				break;
			}
		}

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		Thread.sleep(2000);

		List<WebElement> suggestions = driver
				.findElements(By.xpath("//div[@role='listbox']//div[@role='option']//span"));
		for (WebElement names : suggestions) {
			System.out.println(names.getText());
			if (names.getText().contains("a")) {
				names.click();
				break;
			}
		}

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		List<WebElement> status = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));

		for (WebElement stats : status) {
			System.out.println(stats.getText());
			if (stats.getText().contains("Enabled")) {
				stats.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Arunraj");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("A@bcd1234");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("A@bcd1234");

		try {
			WebElement saveEle = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", saveEle);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Arunraj");
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Arunraj')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'Arunraj')]")).click();
		driver.findElement(By.xpath("//div[text()='Arunraj']//following::i[@class='oxd-icon bi-trash']")).click();
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

		List<WebElement> values1 = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li"));

		for (WebElement element : values1) {
			if (element.getText().contains("Logout")) {
				element.click();
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

	}

}
