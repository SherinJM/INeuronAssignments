//Write a program which can store List of Integer values and print all the values using for loop.

package assignment3;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);

		for (int num = 0; num < obj.size(); num++) {
			System.out.println(obj.get(num));
		}

	}
}
