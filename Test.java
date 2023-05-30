package Questions;

public class Test {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String c = args[0] + args[1];
		System.out.println("value of c is : " + c);
		System.out.println("Value of a+b is : " + (a + b));
		
		/* the output for the first SOUT is 57 by concatenating the two strings a and b 
		 and the output for the second SOUT is 12 by adding the two integers because of the code in line 7 and 8.
		 
		*/
		
	}

}
