package jan07assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * 
4- Create a method in Utility class named as "waitForElement" (dont use any waits)
	method should except locator and timeout in seconds
	will wait until element is not enabled
	add sleep of 1 second
	handle all exception while retrying
	
 */
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static WebElement waitForElement(WebDriver driver, By locator, int seconds) throws InterruptedException {

		WebElement element = driver.findElement(locator);
		for (int i = 0; i < 15; i++) {
			if (element.isEnabled()) {

				break;
			} else {
				try {
					Thread.sleep(1000);
				} catch (SessionNotCreatedException e) {
					System.out.println("Handling Session not created exception");
				} catch (StaleElementReferenceException e) {
					System.out.println("Handling Stale element exception");
				} catch (TimeoutException e) {
					System.out.println("Handling Timeout exception");
				}
			}

		}
		return element;

	}

}
