package assignment8;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*
Task 3
Note- Please use only xpath in this scenario
Open https://www.facebook.com/
Click on Create new account 
Fill in all details and click on the Signup button
 * 
 */


public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mukesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Otwani");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"))
				.sendKeys("mukeshO@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("mukeshO@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcd1234");

		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		List<WebElement> dayValues = day.getOptions();
		Iterator<WebElement> itrDay = dayValues.iterator();
		WebElement e;
		while (itrDay.hasNext()) {
			e = itrDay.next();
			if (e.getText().contains("10")) {
				e.click();
				break;
			}
		}

		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> monthDropDownValues = month.getOptions();
		Iterator<WebElement> itrMonth = monthDropDownValues.iterator();

		while (itrMonth.hasNext()) {
			e = itrMonth.next();
			if (e.getText().contains("Mar")) {
				e.click();
				break;
			}

		}

		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		List<WebElement> yearDropDownValues = year.getOptions();
		Iterator<WebElement> itrYear = yearDropDownValues.iterator();

		while (itrYear.hasNext()) {
			e = itrYear.next();
			if (e.getText().contains("2000")) {
				e.click();
				break;
			}

		}

		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

	}
}
