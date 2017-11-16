package ifstatements.exercises;

import java.util.Scanner;

/*   Write a program to determine the cost of an automobile insurance premium, 
*    based on driver's age and the number of accidents that the driver has had.
* 
*    The basic insurance charge is $500. There is a surcharge of $100 if the driver is 
*    under 25 and an additional surcharge for accidents:
*    # of accidents               	Accident Surcharge
*          1                              	50
*          2                               125
*          3                               225
*          4                               375
*          5                               575
*          6                        or more No insurance
*/
public class Fem {
	public static void main(String[] args) {
		System.out.println(
				"Föratt vi ska kunna ta reda på hur mycket du behöver betala i försäkring, måste du svara på två frågor:");

		Scanner userAge = new Scanner(System.in);
		System.out.println("1, Hur gammal är du ?:");

		int age = userAge.nextInt();

		Scanner userAccidents = new Scanner(System.in);
		System.out.println("2, Hur många olyckor har du varit med om ?:");

		int olyckor = userAccidents.nextInt();

		int pengar = 500;

		if (age < 25) {
			pengar = pengar + 100;

		} else {
			pengar = pengar;

		}
		if (olyckor == 1) {
			pengar = pengar + 50;

		} else if (olyckor == 2) {
			pengar = pengar + 125;
		} else if (olyckor == 3) {
			pengar = pengar + 225;
		} else if (olyckor == 4) {
			pengar = pengar + 375;
		} else if (olyckor == 5 || olyckor > 5) {
			pengar = pengar + 575;
		}
		System.out.println("Det du får betala är :" + pengar);

	}

}
