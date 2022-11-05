/*Task 1- Create a class name as “Trainer” which will have 4 fields name, department ,  email, id. Trainer can teach Selenium, DevOps, Web Development.
Note- use method, constructor 

Trainer details are 
Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2
Trainer 1 – “Mukesh” ,”DevOps”,mukesh@gmail.com, 3

Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3 can teach DevOps.

 */



package assignment2;

public class Trainer {
	String name;
	String department;
	String email;
	int id;

	public Trainer(String trainerName, String trainerDepartment, String TrainerEmail, int TrainerId) {
		name = trainerName;
		department = trainerDepartment;
		email = TrainerEmail;
		id = TrainerId;
	}

	public static void main(String[] args) {

		Trainer trainer1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		trainer1.seleniumTrainer();
		trainer2.webdevelopmentTrainer();
		trainer3.devopsTrainer();
	}

	public void seleniumTrainer() {
		System.out.println("Trainer 1 can teach Selenium");
		System.out.println(
				"Name: " + name + " |Department is: " + department + " |Email id is: " + email + " |Id is: " + id);
	}

	public void webdevelopmentTrainer() {
		System.out.println("Trainer 2 can teach Web Development");
		System.out.println(
				"Name: " + name + " |Department is: " + department + " |Email id is: " + email + " |Id is: " + id);
	}

	public void devopsTrainer() {
		System.out.println("Trainer 3 can teach Devops");
		System.out.println(
				"Name: " + name + " |Department is: " + department + " |Email id is: " + email + " |Id is: " + id);
	}
}
