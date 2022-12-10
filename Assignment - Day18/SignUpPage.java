package calendarControls;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sherin");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sherinjacob@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sherin");
		driver.findElement(By.xpath("//label[contains(text(),'Testing')]")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select sel = new Select(state);
		List<WebElement> listOfState = sel.getOptions();

		for (WebElement i : listOfState) {
			System.out.println(i.getText());
			if (i.getText().equalsIgnoreCase("Kerala")) {
				i.click();
				break;
			}
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement btn_SignUp = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));

		if (btn_SignUp.isEnabled()) {
			btn_SignUp.click();
		}

	}

}
