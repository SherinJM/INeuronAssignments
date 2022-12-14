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
Task 4
Perform same steps which you did in task 3 but replace all xpath with css Selectors.
 * 
 */

public class Task4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Mukesh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Otwani");
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"))
				.sendKeys("mukeshO@gmail.com");
		driver.findElement(By.cssSelector("input[aria-label='Re-enter email address']")).sendKeys("mukeshO@gmail.com");
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("abcd1234");

		Select day = new Select(driver.findElement(By.cssSelector("select[id='day']")));
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

		Select month = new Select(driver.findElement(By.cssSelector("select[id='month']")));
		List<WebElement> monthDropDownValues = month.getOptions();
		Iterator<WebElement> itrMonth = monthDropDownValues.iterator();

		while (itrMonth.hasNext()) {
			e = itrMonth.next();
			if (e.getText().contains("Mar")) {
				e.click();
				break;
			}

		}

		Select year = new Select(driver.findElement(By.cssSelector("select[id='year']")));
		List<WebElement> yearDropDownValues = year.getOptions();
		Iterator<WebElement> itrYear = yearDropDownValues.iterator();

		while (itrYear.hasNext()) {
			e = itrYear.next();
			if (e.getText().contains("2000")) {
				e.click();
				break;
			}

		}

		driver.findElement(By.cssSelector("span[data-name='gender_wrapper']>span:nth-child(2)>label")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

	}
}
