package Questions;

public class PrintTable {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;

		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i * j);
			}
			System.out.println();
		}
	}

}
