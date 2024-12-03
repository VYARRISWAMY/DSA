package SingleDimensionArray;

public class SDAS {
		String[] arr;

		public SDAS(int size) {
			arr = new String[size];
		}

		public void insertion(int index, String str) {
			try {
				if (arr[index] == null) {
					arr[index] = str;
					System.out.println("value is inserted");
				} else {
					System.out.println("cell is full");
				}
			} catch (Exception e) {
				System.out.println("invalid");
			}
		}

		public void traveser() {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

		public void search(String strs) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(strs)) {
					System.out.println("the value is present in index of: " + i);
					return;
				}
			}
			System.out.println("the value is not present");

		}

		public void deleteId(int index) {
			try {
				if (arr[index] != null) {
					arr[index] = null;
					System.out.println("the value is deleted");
				} else {
					System.out.println("no element inserted");
				}
			} catch (Exception e) {
				System.out.println("invalid");
			}
		}

		public static void main(String[] args) {
			SDAS da = new SDAS(2);
			da.insertion(0, "hello");
			da.insertion(1, "java");
			da.traveser();
//			da.deleteId(1);
			da.search("java");
		}

	}

