/*
1-	Create a list of String and print the values in reverse order
Input – Java, Selenium, TestNG, Git, Github
Output- Github, Git, TestNG, Selenium, Java
*/

package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<String> automationTools = new ArrayList<>();
		automationTools.add("Java");
		automationTools.add("Selenium");
		automationTools.add("TestNG");
		automationTools.add("Git");
		automationTools.add("Githib");

		System.out.println("List contains: " + automationTools);

		// Solution 1

		Collections.reverse(automationTools);
		System.out.println("Solution 1 - Printing values in the reverse order: " + automationTools);

		// Solution 2
		
		System.out.println("Solution 2 - Printing values in the reverse order: ");
		for (int i = automationTools.size() - 1; i > -1; i--) {

			System.out.println(automationTools.get(i));
		}

	}

}
