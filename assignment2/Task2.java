/*Task 2- Extension of task 1 – Store all trainer information in Array.*/


package assignment2;

public class Task2 {
	Object[] array = new Object[4];

	public Task2(String trainerName, String trainerDepartment, String TrainerEmail, int TrainerId) {

		array[0] = trainerName;
		array[1] = trainerDepartment;
		array[2] = TrainerEmail;
		array[3] = TrainerId;
	}

	public static void main(String[] args) {

		Task2 trainer1 = new Task2("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Task2 trainer2 = new Task2("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Task2 trainer3 = new Task2("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		trainer1.seleniumTrainer();
		trainer2.webdevelopmentTrainer();
		trainer3.devopsTrainer();
	}

	public void seleniumTrainer() {
		System.out.println("Trainer 1 can teach Selenium");
		System.out.println("Name: " + array[0] + " |Department is: " + array[1] + " |Email id is: " + array[2]
				+ " |Id is: " + array[3]);
	}

	public void webdevelopmentTrainer() {
		System.out.println("Trainer 2 can teach Web Development");
		System.out.println("Name: " + array[0] + " |Department is: " + array[1] + " |Email id is: " + array[2]
				+ " |Id is: " + array[3]);
	}

	public void devopsTrainer() {
		System.out.println("Trainer 3 can teach Devops");
		System.out.println("Name: " + array[0] + " |Department is: " + array[1] + " |Email id is: " + array[2]
				+ " |Id is: " + array[3]);
	}
}