package SingleDimensionArray;


	import java.util.Random;
	import java.util.Scanner;

	class Passenger {
		private String name;
		private int age;
		private char gender;
		private String phno;
		private String fromplace;
		private String destination;
		private int seatno;
		private String PNRNO;

		public Passenger(String name, int age, char gender, String phno, String fromplace, String destination, int seatno,
				String pNRNO) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.phno = phno;
			this.fromplace = fromplace;
			this.destination = destination;
			this.seatno = seatno;
			PNRNO = pNRNO;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public char getGender() {
			return gender;
		}

		public String getPhno() {
			return phno;
		}

		public String getFromplace() {
			return fromplace;
		}

		public String getDestination() {
			return destination;
		}

		public int getSeatno() {
			return seatno;
		}

		public String getPNRNO() {
			return PNRNO;
		}

		@Override
		public String toString() {
			return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + ", phno=" + phno + ", fromplace="
					+ fromplace + ", destination=" + destination + ", seatno=" + seatno + ", PNRNO=" + PNRNO + "]";
		}

	}


