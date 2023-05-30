package Questions;

import java.util.Arrays;

public class EeveOdd2 {

	public static void main(String[] args) {

		int counter = 0;
		int a = 5;
		// initialize array
		int e[] = new int[a];
		int o[] = new int[a];

		// for even arrays
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				e[counter++] = i;

			}
			if (counter == 5)
				break;
		}
		System.out.println(Arrays.toString(e));

		// for odd array
		counter = 0;
		for (int j = 0; j <= 20; j++) {
			if (j % 2 != 0) {
				o[counter++] = j;
			}

			if (counter == 5)
				break;

		}
		System.out.println(Arrays.toString(o));

		int add[] = new int[a];
		for (int i = 0; i < a; i++) {
			add[i] = e[i] + o[i];
		}
		System.out.println("\nAdded array is\n" + Arrays.toString(add));
	}

}
