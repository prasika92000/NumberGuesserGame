package numberguesser;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int randomnumber = random.nextInt(100);// The variable randomnumber is assigned a random integer between 0
												// (inclusive) and 100 (exclusive) using the nextInt() method of the
												// Random class.
		int rounds = 1;//rounds is set to 1 and will keep track of the number of rounds played.
		int result = 0;//result is initially set to 0 and will be used to determine if the player wins (1) or loses (0).
		int number = 0;//number will store the user's input for each round.

		while (rounds <= 6) {
			System.out.println("Rounds" + rounds);

			System.out.println("Enter the Number: ");
			number = sc.nextInt();

			if (number == randomnumber) {
				result = 1;
				break;
			} else if (number < randomnumber) {
				System.out.println("Number is low,Enter a higher number: ");
			} else if (number > randomnumber) {
				System.out.println("Number is High,Enter a lower number: ");
			} else {
				System.out.println("INVALID INPUT");
			}
			rounds++;

		}
		if (result == 1) {
			System.out.println("YOU WIN");
		} else {
			System.out.println("YOU LOOSE");
			System.out.println("The number was :" + randomnumber);
		}

	}

}


