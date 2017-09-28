package BasicCodes;

import java.util.Scanner;

public class ReverseOfString1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = s.nextLine();
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}

}
