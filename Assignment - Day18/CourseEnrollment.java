package calendarControls;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CourseEnrollment {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sherinjacob@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sherin");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> courseNames = driver.findElements(By.xpath("//h2[@class='name']"));

		for (WebElement cName : courseNames) {
			if (cName.getText().equalsIgnoreCase("Selenium")) {
				cName.click();
				driver.findElement(By.xpath("//button[contains(text(), 'Enroll')]")).click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (driver.findElement(By.xpath("//button[contains(text(), 'ENROLLED')]")).getText()
				.equalsIgnoreCase("Enrolled")) {

			driver.findElement(By.xpath("//button[contains(text(), 'Sign out')]")).click();
			System.out.println("Enrolled for the Course");

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
