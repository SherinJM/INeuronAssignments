package assignment_day4;

public class Task10 {

	public static void main(String[] args) {
//		Task 10- Write a program which will break the current execution if it find “Selenium”
		// Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

		String input[] = { "Java", "JavaScript", "Selenium", "Pythin", "Mukesh" };

		for (int i = 0; i < input.length; i++) {
			if (input[i].equalsIgnoreCase("Selenium")) {
				break;
			}
			System.out.println(input[i]);
		}

	}

}
