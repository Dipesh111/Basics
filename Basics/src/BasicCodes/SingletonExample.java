package BasicCodes;

public class SingletonExample {
	public static SingletonExample instance = null;
	static int count;

	private SingletonExample() {
		System.out.println("Object creation started");
		count++;
		System.out.println(count);
	}

	public static SingletonExample singleton() throws Exception {
		if (count < 3) {
			instance = new SingletonExample();
		} else {
			throw new Exception("Cannot create objects more than 3");
		}
		return instance;
	}

	public static void main(String[] args) throws Exception {
		SingletonExample s1 = SingletonExample.singleton();
		SingletonExample s2 = SingletonExample.singleton();
		SingletonExample s3 = SingletonExample.singleton();
		SingletonExample s4 = SingletonExample.singleton();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
