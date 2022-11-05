//Write a program which can store List of Integer values and print all the values using for for loop

package assignment3;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);

		for (int nos : obj) {
			System.out.println(nos);
		}

	}
}
