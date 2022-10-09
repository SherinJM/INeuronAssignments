package assignment_day4;

public class Task1 {

	public static void main(String[] args) {

		// Task 1 – Write a program to swap two number. For example a=10 and b=20 output
		// should be a=20 and b=10

		int a = 10;
		int b = 20;
		int c;

		System.out.println("Value of a & b before swapping: " + a + "&" + b);

		c = a;
		a = b;
		b = c;

		System.out.println("Value of a & b after swapping: " + a + "&" + b);

	}

}
