package calendarControls;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment10 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Manage')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		WebElement manageCourses = driver.findElement(By.xpath("//span[contains(text(),'Manage Courses')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", manageCourses);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement element1 = driver.findElement(By.xpath("//th[contains(text(),'Course Name')]"));
		act.moveToElement(element1).perform();

		driver.findElement(By.xpath("//button[contains(text(),'Add New Course')]")).click();

		driver.findElement(By.cssSelector("input[id='thumbnail']"))
				.sendKeys("C:\\Users\\huawei\\OneDrive\\Desktop\\Selenium.png");
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Selenium Job Ready");
		driver.findElement(By.cssSelector("textarea[id='description']")).sendKeys("Extensive Selenium Classes");
		driver.findElement(By.cssSelector("input[id='instructorNameId']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.cssSelector("input[id='price']")).sendKeys("5000");
		driver.findElement(By.cssSelector("input[name='startDate']")).click();

		int flag = 0;
		for (int j = 0; j < 12; j++) {

			WebElement mAndY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));

			if (mAndY.getText().equalsIgnoreCase("April 2023")) {
				flag = 1;
				driver.findElement(By.xpath("(//div[text()=2])[1]")).click();
			}
			if (flag == 1) {
				break;
			}
			WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Next Month')]"));
			js.executeScript("arguments[0].click()", e);

		}
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name='endDate']")).click();

		int flag1 = 0;
		for (int j = 0; j < 12; j++) {

			WebElement mAndY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));

			if (mAndY.getText().equalsIgnoreCase("April 2023")) {
				flag1 = 1;

				driver.findElement(By.xpath("(//div[text()=30])[2]")).click();

			}
			if (flag1 == 1) {
				break;
			}
			WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Next Month')]"));
			js.executeScript("arguments[0].click()", e);

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Select Category')]")).click();

		List<WebElement> listOfCourses = driver.findElements(By.xpath("//button[@class='menu-item']"));

		for (WebElement courses : listOfCourses) {
			if (courses.getText().contains("Testing")) {
				courses.click();
				break;
			}
		}

		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

		Thread.sleep(3000);

		if (driver.findElement(By.xpath("//td[contains(text(),'Selenium Job Ready')]")).getText()
				.contains("Selenium Job Ready")) {
			System.out.println("Course has been added");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//td[contains(text(),'Selenium')]//following::button")).click();
		Thread.sleep(2000);

		try {
			if (driver.findElement(By.xpath("//td[contains(text(),'Selenium Job Ready')]")).getText()
					.contains("Selenium Job Ready")) {
				System.out.println("Course is not deleted");
			}
		} catch (Exception e) {
			System.out.println("Course is deleted");
		}

		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.quit();
	}

}
