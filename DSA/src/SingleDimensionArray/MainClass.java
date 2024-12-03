package SingleDimensionArray;
class Data {
	private String day;
	private int temp;

	public Data(String day, int temp) {
		super();
		this.day = day;
		this.temp = temp;
	}

	public String getDay() {
		return day;
	}

	public int getTemp() {
		return temp;
	}

	@Override
	public String toString() {
		return " [day=" + day + ", temp=" + temp + "]";
	}

}

class Weather {
	private Data[] days = new Data[7];

	public void insertWeather(int index, Data d1) {
		try {

			if (days[index] == null) {
				days[index] = d1;
				System.out.println("The data is added: " + days[index].toString());
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inavlid Index");
		}
	}

	public void findMaxTemp() {
		int maxTemp = 0, j = 0;
		for (int i = 0; i < days.length; i++) {
			if (days[i] != null) {
				int temp = days[i].getTemp();// 22,36,27,37
				if (maxTemp < temp) {// 0 < 22 22 < 36 36<27 36<37
					maxTemp = temp;// 37
					j = i;// 3
				}
			} else {
				System.out.println("Fill the weather report completely");
				break;
			}
		}
		System.out.println("The Maximun Temperature is: " + days[j].toString());
	}

	public void displayWeather() {
		System.out.println("SlNO\tDAY\tTemp");
		for (int i = 0; i < days.length; i++) {
			if (days[i] != null)
				System.out.println((i + 1) + "\t" + days[i].getDay() + "\t" + days[i].getTemp());
		}
	}

}

public class MainClass {
	public static void main(String[] args) {
		Weather w1 = new Weather();
		w1.insertWeather(0, new Data("Mon", 22));
		w1.insertWeather(1, new Data("Tue", 36));
		w1.insertWeather(2, new Data("Wed", 27));
//		w1.insertWeather(3, new Data("Thu", 37));
//		w1.insertWeather(4, new Data("Fri", 27));
//		w1.insertWeather(5, new Data("Sat", 20));
//		w1.insertWeather(6, new Data("Sun", 17));
		w1.displayWeather();
		w1.findMaxTemp();
	}
}