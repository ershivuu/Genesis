package Questions;

public class SplitString {
	public static void main(String[] args) {
		String str = "abc123def456ghi789";
		separate(str);
	}

	public static void separate(String str) {
		StringBuilder sbInt = new StringBuilder();
		StringBuilder sbStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				sbInt.append(c);
			} else {
				sbStr.append(c);
			}
		}

		System.out.println("Integers: " + sbInt.toString());
		System.out.println("Strings: " + sbStr.toString());
	}
}
