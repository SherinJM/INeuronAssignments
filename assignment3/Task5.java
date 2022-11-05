//Write a program which will pick the values from Array and Store them List.

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		System.out.println("Stored values in the list are: " + list);

	}

}
