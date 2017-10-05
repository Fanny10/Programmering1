package exercises.oop;

public class mainRectangle {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(1.0f, 1.0f);

		System.out.println(rectangle.getLength());
		rectangle.setLength(1.0f);

		System.out.println(rectangle.getWidth());
		rectangle.setwidth(1.0f);

	}

}
