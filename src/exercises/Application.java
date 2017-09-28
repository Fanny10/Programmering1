package exercises;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Person fannysPerson = new Person("Fanny");
		fannysPerson.writeName();

		fannysPerson.setName("Mow");
		fannysPerson.writeName();
	}
}
