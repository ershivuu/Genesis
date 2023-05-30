package Questions;

public class Numeric1 {

	public static void main(String[] args) {

		int n = 5;
		int m = 1;

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
	}
}
