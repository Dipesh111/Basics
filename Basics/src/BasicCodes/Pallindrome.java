package BasicCodes;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int i = 0, temp = 0, sum = 0, r = 0;
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Entered number is Pallindrome");
		} else {
			System.out.println("Entered number is not Pallindrome");
		}
	}
}

//A palindrome number is a number that is same after reverse.
//ex 121=121