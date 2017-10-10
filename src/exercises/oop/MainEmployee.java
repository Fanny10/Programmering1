package exercises.oop;

public class MainEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee(16, "Fanny", "Lindqvist", 35000);

		System.out.println(employee.getId());

		System.out.println(employee.getFirstName());

		System.out.println(employee.getLastName());

		System.out.println(employee.getSalary());
		employee.setSalary(37000);
		System.out.println(employee.getSalary());
		
		System.out.println(employee.toString());
		

	}

}
