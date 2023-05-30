package Questions;

public class Evenlypaced {

	public static void main(String[] args) {
		int a = 2, b = 4, c = 6;
		/*
		 * a -> Small b -> medium c -> large
		 */
		boolean result = true;

		if ((b - a) == (c - b))
			result = true;
		else
			result = false;

		System.out.println(result);
	}

}
