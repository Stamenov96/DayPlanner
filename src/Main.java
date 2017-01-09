import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws WrongChoiceExeption {

		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Please choose an option");
			System.out.println("1.List all Events");
			System.out.println("2.Add new Event");
			System.out.println("3.Edit Event");
			System.out.println("4.Delete Event");
			System.out.println("5.Display in table");
			System.out.println("6.Exit");

			int choice = reader.nextInt();
			if (choice > 0 || choice < 6) {

				switch (choice) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;

				default:
					break;
				}

			} else {
				throw new WrongChoiceExeption();
			}

		}

	}

}
