package polymorphism;

public class Main_MethodOverloading {

	public static void main(String[] args) {
		System.out.println("main with Strings[]");
		main("hellow");
		main();

	}
	public static void main(String args) {
		System.out.println("main with Strings");

	}
	public static void main() {
		System.out.println("main without args");

	}
}
