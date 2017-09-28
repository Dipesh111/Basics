package BasicCodes;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int i = 0, j = 0, temp;
		int[] a;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want in an array");
		n = s.nextInt();
		a = new int[n];
		System.out.println("Enter the array element to be sorted :");
		for (i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting array elements are:");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
