package BasicCodes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i, n, a = 0, b = 1, c = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Till how many numbers you want fibonacci series to be printed");
		n = s.nextInt();
		System.out.print(a + " " + b);
		for (i = 2; i <= n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
}
