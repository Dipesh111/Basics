package BasicCodes;

import java.util.Scanner;

public class DeleteArrayElementAtPosition {

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
		System.out.println("Enter the position where you want to delete an element");
		pos = s.nextInt();
		for (i = pos - 1; i < n-1; i++) {
			a[i] = a[i + 1];
		}
		System.out.println("After deleting element array is:");
		for (i = 0; i < n-1; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
