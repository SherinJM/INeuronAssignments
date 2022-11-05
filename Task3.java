//Write a program which can store List of Integer values and print all the values using for iterator

package assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);

		for (Iterator<Integer> i = obj.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}

	}
}
