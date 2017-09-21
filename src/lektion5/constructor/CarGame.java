package lektion5.constructor;

public class CarGame {

	public static void main(String[] args) {
		Car fannysBil = new Car ("pink");
		
		
		System.out.println(fannysBil.getSpeed());
		
		fannysBil.setSpeed(2000);
		System.out.println(fannysBil.getSpeed());
	
		

	}

}
