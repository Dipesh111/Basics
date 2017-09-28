package BasicCodes;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1 = s.nextInt();
		num2 = s.nextInt();
		int max = num1;
		if (num1 > num2)
			System.out.println("Largest number is :" + num1);
		else {
			System.out.println("Largest number is :" + num2);
		}
	}
}
