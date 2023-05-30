package Questions;

public class SearchingNum {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6 };
		int key = 5;

		boolean result = contains(array, key);
		System.out.println(result);
	}

	public static boolean contains(int[] array, int key) {
		boolean test = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				test = true;
				break;
			} else
				test = false;
		}
		return test;
	}

}
