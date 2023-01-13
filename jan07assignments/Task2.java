package jan07assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

/*
 * 2- Create a method in Utility class named as "captureScreenshotOfWebElement"
	will capture the screenshot of element
	will store element screenshot in element screenshot folder
	all screenshot should have date time stamp
	
 * 
 * 
 */

public class Task2 {

	public static void captureScreenShot(WebDriver driver, WebElement element) {

		try {
			FileHandler.copy((element.getScreenshotAs(OutputType.FILE)), new File("./Screenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
