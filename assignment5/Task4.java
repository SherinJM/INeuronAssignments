/*
 * Task 4
Open the below application and verify the capture all href values from social media icons. Store all 4 href values in map in below format.
FaceBook - fburl
Twitter - Twitter url
Youtube - Youtube URL
Linkedin - Linkedin URL
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

 */

package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		Map<String, String> storedValues = new TreeMap<>();
		String names[]= {"Linkedin","Facebook","Twitter","Youtube"};
		int i=0;
		for (WebElement l : allLinks) {
			String href = l.getAttribute("href");
			storedValues.put(href,names[i]);
			i=i+1;
		}

		System.out.println(storedValues);

	}

}