package assignment_day4;

public class Task8 {

	public static void main(String[] args) {
		// Task 8- Write a program to print below students marks who have scored above
		// 80
		// Example- 78,12,89,55,35
		// Output- 78,89

		int students[] = { 78, 12, 89, 55, 35 };

		for (int i = 0; i < students.length; i++) {
			if (students[i] > 80) {
				System.out.println(students[i]);
			}
		}

	}

}
