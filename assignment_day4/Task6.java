package assignment_day4;

public class Task6 {

	public static void main(String[] args) {
		// Task 6- Write a program to print all prime numbers from 1-1000
		
		int count=0;

		for (int i = 1; i <= 1000; i++) {
			int counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				System.out.println(i);
				count++;
			}

		}
		
		System.out.println("Total number of PRime nos. beween 1 to 100: "+count);

	}

}
