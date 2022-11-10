/*2-	Write a program which will accept List of String and produce another List of string of which will have only values 
 * which starts with git
Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
Output- Git, Github, Gitlab, GitBash*/

package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Git");
		list.add("Github");
		list.add("GitBash");
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");

		System.out.println("List contains: " + list);

		List<String> listNew = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).contains("Git")) {
				listNew.add(list.get(i));
			}

		}

		System.out.println("New list produced: " + listNew);

	}

}
