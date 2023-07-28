package numberguesser;

import java.util.Scanner;

public class NumberGuesser2 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        int number = (int)(Math.random() * 100) + 1;
		        int guesses = 0;

		        while (true) {
		            System.out.print("Guess a number between 1 and 100: ");
		            int guess = scanner.nextInt();
		            guesses++;

		            if (guess == number) {
		                System.out.println("You guessed it right! It took you " + guesses + " guesses.");
		                break;
		            } else if (guess < number) {
		                System.out.println("Sorry, too low.");
		            } else {
		                System.out.println("Sorry, too high.");
		            }
		        }

		        System.out.println("Would you like to play again? (y/n): ");
		        String answer = scanner.next();

		        if (answer.equals("y")) {
		            main(args);
		        }
		    }
		
	}


