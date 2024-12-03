package SingleDimensionArray;
import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Booking redBus = new Booking(10);

		boolean running = true;

		while (running) {
			System.out.println("\nMenu:");
			System.out.println("1. Book a seat");
			System.out.println("2. Show available seats");
			System.out.println("3. Display confirmed bookings");
			System.out.println("4. Search for a passenger by name");
			System.out.println("5. Search for a booking by seat number");
			System.out.println("6. Cancel a booking");
			System.out.println("7. Exit");
			System.out.print("Select an option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter seat number: ");
				int seatNumber = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter passenger name: ");
				String passengerName = sc.nextLine();
				System.out.print("Enter gender (M/F): ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("Enter passenger age: ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter phone number: ");
				String phoneNumber = sc.nextLine();
				System.out.print("Enter departure city: ");
				String from = sc.nextLine();
				System.out.print("Enter destination city: ");
				String to = sc.nextLine();

				redBus.bookTickets(seatNumber, passengerName, age, gender, phoneNumber, to, from);

				break;

			case 2:
				redBus.showAvailableSeats();
				break;

			case 3:
				System.out.println("enter passenger seat number: ");
				redBus.displayConfirmed(sc.nextInt());
				break;

			case 4:
				System.out.print("Enter passenger name to search: ");
				String searchName = sc.nextLine();
				redBus.search(searchName);
				break;

			case 5:
				System.out.print("Enter seat number to search: ");
				int searchSeat = sc.nextInt();
				redBus.search(searchSeat);
				break;

			case 6:
				System.out.print("Enter seat number to cancel: ");
				int cancelSeat = sc.nextInt();
				redBus.cancelBooking(cancelSeat);
				break;

			case 7:
				System.out.println("Exiting the system.");
				running = false;
				break;

			default:
				System.out.println("Invalid option. Please select again.");
			}
		}
		sc.close();
	}

}