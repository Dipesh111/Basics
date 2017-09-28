package BasicCodes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharacterRepeated {

	public static void main(String[] args) {
		int i = 0;
		String str;
		int count;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		str = s.nextLine();

		HashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (m.containsKey(ch)) {
				count = m.get(ch);
				count = count + 1;
				m.put(ch, count);
			} else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
	}
}
