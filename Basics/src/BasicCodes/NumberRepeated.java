package BasicCodes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NumberRepeated {

	public static void main(String[] args) {
		int num;
		int count;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		HashMap<Integer, Integer> m = new HashMap<>();
		while (num > 0) {
			int ch = num % 10;
			if (m.containsKey(ch)) {
				count = m.get(ch);
				count = count + 1;
				m.put(ch, count);
			} else {
				m.put(ch, 1);
			}
			num = num / 10;
		}
		System.out.println(m);
	}
}
