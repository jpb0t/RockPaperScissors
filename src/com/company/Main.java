package com.company; //What's this?
import java.util.*;

public class Main {

    public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    Random rand = new Random();

	    //Variables
        String compRPSDeclare = null;
        String userRPSDeclare = null;
        int userNumInput ;
        int compNumRandom;
        int win = 0;
        int lose = 0;
        int draw = 0; //Told me to separate.
        int userQuit = 0;
        boolean continueGame = true;
        //boolean saves more memory compared to Boolean. Interchangeable.

        //Block 1: Requesting UI and loop
        do {
            compNumRandom = rand.nextInt(3); //Sets the range.

            System.out.println("Rock = 0, Paper = 1, Scissors = 2 " +
                    "\nPlease enter a number: ");
            userNumInput = input.nextInt();

            switch (compNumRandom) {
                case 0: compRPSDeclare = ("Rock"); break;
                case 1: compRPSDeclare = ("Paper"); break;
                case 2: compRPSDeclare = ("Scissors"); break;
            } //Didn't put default cause it's optional.

            switch (userNumInput) {
                case 0: userRPSDeclare = ("Rock"); break;
                case 1: userRPSDeclare = ("Paper"); break;
                case 2: userRPSDeclare = ("Scissors"); break;
            }

            if (compNumRandom == 0 && compNumRandom == userNumInput ||
                    + compNumRandom == 1 && compNumRandom == userNumInput ||
                    + compNumRandom == 2 && compNumRandom == userNumInput) {
                System.out.println("**Computer played " + compRPSDeclare + " and you played " +
                        userRPSDeclare + ". It's a draw.");
                draw = +1;
            }
            else if (compNumRandom == 1 && userNumInput == 0 ||
                    + compNumRandom == 2 && userNumInput == 1 ||
                    + compNumRandom == 0 && userNumInput == 2) {
                System.out.println("**Computer played " + compRPSDeclare
                        + " and you played " + userRPSDeclare+ ". You lose.");
                lose = +1;
            }
            else if (compNumRandom == 2 && userNumInput == 0 ||
                    + compNumRandom == 0 && userNumInput == 1 ||
                    + compNumRandom == 1 && userNumInput == 2) {
                System.out.println("**Computer played " + compRPSDeclare + " and you played " +
                        userRPSDeclare + ". You win.");
                win = +1;
            }
            System.out.println("Press 3 to stop playing or press any other key and enter to continue.");
            userQuit = input.nextInt(); //This wouldn't work. Had a hard time figuring it out.
                                    //So, it didn't work because it was input.nextln, lol.
                                    //Had to change it to int. IDK y regex wouldn't work.
            if (userQuit == 3) {
                continueGame = false;
            }
        }
        while (continueGame);

        if (continueGame == false); {
            System.out.println("Thanks for playing the game! Your final score is: \n" +
                    win + " Wins " + lose + " Loss " + draw + " Draws.");
        }
    }
}
