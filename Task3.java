/*Task 3 – Create a program which will store students information and print the output.
Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
Once all entries are done, program should ask which user information you want to fetch and should print the same.
Note- Use scanner class for dynamic students
*/

package assignment2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Student's information you wanna store");
		int noOfStudents = sc.nextInt();
		Object[][] array = new Object[noOfStudents][5];

		for (int i = 0; i < noOfStudents; i++) {

			System.out.println("Enter name");
			array[i][0] = sc.next();
			System.out.println("Enter email");
			array[i][1] = sc.next();
			System.out.println("Enter phone number");
			array[i][2] = sc.nextLong();
			System.out.println("Enter address");
			array[i][3] = sc.next();
			System.out.println("Enter status");
			array[i][4] = sc.next();

		}

		System.out.println("Which student information would you like to fetch ?");
		int studentDisplay = sc.nextInt();

		if (studentDisplay == 1) {
			System.out.println("Name: " + array[0][0] + " Email: " + array[0][1] + " Phone number: " + array[0][2]
					+ " Address: " + array[0][3] + " Status: " + array[0][4]);

		} else {

			System.out.println("Name: " + array[studentDisplay - 1][0] + " Email: " + array[studentDisplay - 1][1]
					+ " Phone number: " + array[studentDisplay - 1][2] + " Address: " + array[studentDisplay - 1][3]
					+ " Status: " + array[studentDisplay - 1][4]);

		}

	}

}
