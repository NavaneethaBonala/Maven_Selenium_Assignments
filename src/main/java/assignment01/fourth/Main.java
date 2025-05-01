package assignment01.fourth;


public class Main {

	public static void main(String[] args) {

		Boss boss = new Boss(10, "Nita Boss", "Telangana", 968574142, 40000);
		
		Trainee trainee = new Trainee(100, "Nita Trainee", "Hyd", 958674125, 35000);
		
		boss.displayDetails();
		trainee.displayDetails();
	}

}
