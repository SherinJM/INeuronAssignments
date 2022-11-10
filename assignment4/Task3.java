/*3-	Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven
*/

package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

	public static void main(String[] args) {
		List<String> tools = new ArrayList<>();
		tools.add("Java");
		tools.add("TestNG");
		tools.add("Maven");
		tools.add("Java");
		
		System.out.println("List contains: " + tools);

		for (int i = 0; i < tools.size(); i++) {
			int counter = 0;
			for (int j = 0; j < tools.size(); j++) {
				if (tools.get(i).equalsIgnoreCase(tools.get(j))) {
					counter++;
					if (counter == 2) {
						tools.remove(j);
					}
				}
			}

		}
		System.out.println("After removing duplicates, list contains " + tools);

		// Reference
		/*
		 * List<String> newTools=tools.stream().distinct().collect(Collectors.toList());
		 * System.out.println(newTools);
		 */
	}

}
