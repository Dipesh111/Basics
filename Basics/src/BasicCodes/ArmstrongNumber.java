package BasicCodes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i = 0, temp, sum = 0, r = 0;
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum) + r * r * r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("Entered number is Armstrong");
		else
			System.out.println("Entered number is not Armstrong number");
	}
}
/*
 * Armstrong number is a number that is the sum of its own digits each raised to
 * the power of the number of digits is equal to the number itself. 153, 1 ^ 3 +
 * 5 ^ 3 + 3 ^ 3 = 153 
 * 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634
 */