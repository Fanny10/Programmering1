package lesson6.exercises;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello Word");
		// VI har skapat ett object av klassen Person
		Person fannysPerson = new Person("Fanny");
		fannysPerson.writeName();
		
		fannysPerson.setName("Mow");
		fannysPerson.writeName();
	}

}
