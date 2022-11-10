/*4-	Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90*/

package assignment4;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {

		ArrayList<Integer> elements = new ArrayList<>();
		elements.add(10);
		elements.add(45);
		elements.add(90);
		elements.add(45);
		elements.add(23);
		elements.add(90);
		elements.add(44);

		System.out.println("List contains: " + elements);

		for (int i = 0; i < elements.size(); i++) {
			if (i == 1 || i == elements.size() - 2) {
				System.out.println(elements.get(i));
			}

		}

	}

}
