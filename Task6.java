/* Create a list of numbers 33,44,55,66,77,88 and perform below operation
	Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	Convert List into array */

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {

		List<Integer> obj = new ArrayList<Integer>();
		obj.add(33);
		obj.add(44);
		obj.add(55);
		obj.add(66);
		obj.add(77);
		obj.add(88);

		System.out.println("List contains: " + obj);

		// Remove second element from list using index
		obj.remove(1);
		System.out.println("After removing the second element frmo list using index, list contains: " + obj);

		// Remove second element from list using value
		obj.remove(Integer.valueOf(55));
		System.out.println("After removing the second element frmo list using value, list contains: " + obj);

		// Add 90 at index 3
		obj.add(2, 90);
		System.out.println("After adding the value at index 3, list contains: " + obj);

		// Get the length of list
		System.out.println("Length of the list is: " + obj.size());

		// Print all values from list using any values
		System.out.println("List contains: " + obj);

		// Convert List into array
		int array[] = new int[obj.size()];

		int j = 0;
		for (int object : obj) {
			array[j++] = object;
		}
		System.out.println("Array contains: ");
		for (int i : array) {
			System.out.println(i);
		}

	}

}
