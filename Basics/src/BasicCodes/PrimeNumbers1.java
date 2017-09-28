package BasicCodes;

import java.util.Scanner;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		int i, m = 0, flag = 0, n;
		int a[];
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want to check");
		n = s.nextInt();
		a = new int[n];
		System.out.println("Entered numbers are :");
		for (i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			m = a[i] / 2;
			for (i = 2; i <= m; i++) {
				if (a[i] % i == 0) {
					// System.out.println("Number is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.print("Prime numbers are :" + a[i] + " ");
		}

	}
}
