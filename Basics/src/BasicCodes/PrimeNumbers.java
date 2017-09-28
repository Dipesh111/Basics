package BasicCodes;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i, n, m = 0, flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Entered the number to be checked");
		n = s.nextInt();
		if (n == 1) {
			System.out.println(n + " is neither prime nor composite number");
		} else {
			m = n / 2;
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("Number is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Number is prime");
		}
	}
}
