/*Write a program which will display true if list contains Mobile else prints false
	List  - Web Automation, API Automation, Mobile Automation.
	Output – True */

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Web Automation");
		list.add("Api Automation");
		list.add("Mobile Automation");

		int flag = 0;
		for (String name : list) {
			if (name.contains("Mobile")) {
				flag = 1;
			}
		}

		if (flag == 1)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
