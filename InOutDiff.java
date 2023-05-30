package Questions;

import java.util.Scanner;

public class InOutDiff {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the INN time");
		int innTime = s.nextInt();
		System.out.println("Enter the OUT time");
		int outTime = s.nextInt();

		if (innTime <= 0 || outTime > 24) {
			System.out.println("please enter a valid INN and OUT time");
			System.out.println("INN>0 and OUT<=24");
		} else {
			System.out.println("Time difference is :" + (outTime - innTime));
		}
	}

}
