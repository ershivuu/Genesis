package Questions;

import java.util.Arrays;

public class EvenOddArray {

	public static void main(String[] args) {

		int a = 5;

		int e[] = new int[a];
		int o[] = new int[a];

		for (int i = 0; i < a; i++) {
			e[i] = (i + 1) * 2;
			o[i] = ((i + 1) * 2) - 1;
		}

		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(o));

		System.out.println("\nadded array is\n");
		int add[] = new int[a];
		for (int i = 0; i < a; i++) {
			add[i] = e[i] + o[i];
		}
		System.out.println(Arrays.toString(add));

	}
}
