package SingleDimensionArray;

import java.util.Random;

class Booking {
	private Passenger[] p1;

	public Booking(int size) {
		p1 = new Passenger[size];
	}

	public void bookTickets(int seatno, String name, int age, char gender, String phno, String destinationplace,
			String fromplace) {
		try {
			if (p1[seatno - 1] == null) {
				String pnr = generatePNRNO(destinationplace, fromplace);
				p1[seatno - 1] = new Passenger(name, age, gender, phno, fromplace, destinationplace, seatno, pnr);
				System.out.println("The seat number: " + seatno + " is successfully booked.");
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Gender: " + gender);
				System.out.println("From: " + fromplace);
				System.out.println("Destination: " + destinationplace);
				System.out.println("Pnr No: " + pnr);

			}
		} catch (Exception e) {
		}
	}

	public String generatePNRNO(String destinationplace, String fromplace) {
		return new Random().nextInt(9999) + destinationplace.substring(0, 2) + fromplace.substring(0, 2);
	}

	public void displayConfirmed(int seatno) {
		if (p1[seatno - 1] != null) {
			System.out.println("Booking Details");
			System.out.println("PNR no: " + p1[seatno - 1].getPNRNO());
			System.out.println("Name: " + p1[seatno - 1].getName());
			System.out.println("Age: " + p1[seatno - 1].getAge());
			System.out.println("Gender: " + p1[seatno - 1].getGender());
			System.out.println("From : " + p1[seatno - 1].getFromplace());
			System.out.println("Destination place: " + p1[seatno - 1].getDestination());
			System.out.println("Seat no: " + p1[seatno - 1].getSeatno());
			System.out.println("\t");
			System.out.println("Bus Details");
			System.out.println("Service Category: KSRTC");
			System.out.println("Pickup Point: " + p1[seatno - 1].getFromplace());
			System.out.println("Drop point: " + p1[seatno - 1].getDestination());

		} else {
			System.out.println("seat is alread booked");

		}
	}

	public void displayAllPassengersData() {
		System.out.println("Sl no\tName\tAge\tGender\tFrom Place\tDestination\tPNR No\tSeat no");
		for (int i = 0; i < p1.length; i++) {
			if (p1[i] != null) {
				System.out.println(i + 1 + "\t" + p1[i].getName() + "\t" + p1[i].getAge() + "\t" + p1[i].getGender()
						+ "\t" + p1[i].getFromplace() + "\t" + p1[i].getDestination() + "\t" + p1[i].getDestination()
						+ "\t" + p1[i].getPNRNO() + "\t" + p1[i].getSeatno());
			}
		}

	}

	public void search(String passengerName) {
		int j = p1.length - 1;
		for (int i = 0; i < p1.length / 2; i++) {
			if (p1[i] != null && p1[j]!=null) {
				if ((p1[i].getName().equalsIgnoreCase(passengerName))
						|| p1[j].getName().equalsIgnoreCase(passengerName)) {

					System.out.println("Passenger: " + passengerName + " is travalling in this bus in the seat No"
							+ p1[i].getSeatno());
					return;
				} else if (p1[j].getName().equalsIgnoreCase(passengerName)) {
					System.out.println("Passenger: " + passengerName + " is travalling in this bus in the seat No"
							+ p1[j].getSeatno());
					return;
				}
			}
			j--;

		}
		System.out.println("no name present");
	}

	public void search(int seatNumber) {
		if (p1[seatNumber - 1] != null) {
			System.out.println("Passenger: " + p1[seatNumber - 1].getName()
					+ " is travalling in this bus in the seat No" + seatNumber);
		} else {
			System.out.println(seatNumber + "is not booked ticket");
		}
	}

	public void cancelBooking(int seatNumber) {
		try {
			if (p1[seatNumber - 1] != null) {
				p1[seatNumber - 1] = null;
				System.out.println("Ticket has been cancelled");
			} else {
				System.out.println("already cancelled");
			}
		} catch (Exception e) {
			System.out.println("invalid");
		}
	}

	public void showAvailableSeats() {
		System.out.println("Available seat are: ");
		boolean flag = false;
		for (int i = 0; i < p1.length; i++) {
			if (p1[1] == null) {
				System.out.println("seat no " + (i + 1));
				flag = true;
			}
		}
		if (!flag)
			System.out.println("No seat are available");
	}
}
