package BasicCodes;

import java.util.Scanner;

public class InsertArrayElementAtPosition {

	public static void main(String[] args) {
		int i = 0, j = 0, pos;
		int[] a;
		int n, n1;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want in an array");
		n = s.nextInt();
		a = new int[n];
		System.out.println("Enter the array elements :");
		for (i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the position where you want to insert an element");
		pos = s.nextInt();
		System.out.println("Enter the new value to be inserted");
		n1 = s.nextInt();
		for (i = n - 1; i >= pos - 1; i--) {
			a[i] = a[i - 1];
		}
		a[pos - 1] = n1;
		System.out.println("After inserting array elements are:");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
