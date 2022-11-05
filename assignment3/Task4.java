//Write a program which will print sum of all numbers which is stored in list.

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {

		int sum = 0;

		List<Integer> obj = new ArrayList<Integer>();
		obj.add(1000);
		obj.add(2000);
		obj.add(3000);
		obj.add(4000);
		obj.add(5000);

		for (int number : obj) {
			sum = sum + number;
		}

		System.out.println("Sum of all number is: " + sum);
	}

}
