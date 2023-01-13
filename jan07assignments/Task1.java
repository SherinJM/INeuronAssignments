package jan07assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 1 - Open http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
Click on timer
Wait for text "WebDriver"
Use 2 conditions of ExpectedCondition
 * 
 * 
 * 
 */

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//1st Method
//		WebElement element = wait
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'WebDriver')]")));
//		if (element.getText().equals("WebDriver")) {
//			System.out.println("Element Found");
//
//		} else {
//			System.out.println("Element not found");
//		}

//2nd Method		
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'WebDriver')]")));
		if (element1.getText().equals("WebDriver")) {
			System.out.println("Element Found");

		} else {
			System.out.println("Element not found");
		}
	}

}
