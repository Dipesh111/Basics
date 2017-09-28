package BasicCodes;

import java.util.Scanner;

public class StaticDemo {
	static int a;
	static int b = 10;
	int d = 9;

	public static void check() {
		System.out.println("static");
	}

	public void check1() {
		System.out.println("not static");
	}

	public static void main(String[] args) {
		StaticDemo a = new StaticDemo();
		a.check1();
		StaticDemo.check();
		System.out.println(StaticDemo.a = 15);
		System.out.println(StaticDemo.b);
		StaticDemo.b=26;
		System.out.println(b);
		System.out.println(a.d=177);
	}
}
