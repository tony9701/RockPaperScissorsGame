import java.util.Scanner;

public class Player {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";


    void playerMoves() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Choose:\n\n[R]ock\n[P]aper\n[S]cissors\n");

        //Taking the player move
        String move = scanner.nextLine();

        if (move.equalsIgnoreCase("r") || move.equalsIgnoreCase("rock")) {
            move = ROCK;
        } else if (move.equalsIgnoreCase("p") || move.equalsIgnoreCase("paper")) {
            move = PAPER;
        } else if (move.equalsIgnoreCase("s") || move.equalsIgnoreCase("scissors")) {
        move = SCISSORS;
        } else {
            System.out.printf("Invalid command. Please try again!\n");
            System.out.printf("Choose:\n\n[R]ock\n[P]aper\n[S]cissors\n");
            move = scanner.nextLine();
        }
    }
}


