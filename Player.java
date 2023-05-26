import java.util.Scanner;

public class Player {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";


    public String playerMoves() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("""

                Choose:
                *********************
                     [R]ock
                     [P]aper
                     [S]cissors
                *********************
                """);

        //Taking the player move and making while loop until the user input is valid!
        String move = scanner.nextLine();
        while (true) {
            if (move.equalsIgnoreCase("r") || move.equalsIgnoreCase("rock")) {
                move = ROCK;
                break;
            } else if (move.equalsIgnoreCase("p") || move.equalsIgnoreCase("paper")) {
                move = PAPER;
                break;
            } else if (move.equalsIgnoreCase("s") || move.equalsIgnoreCase("scissors")) {
                move = SCISSORS;
                break;
            } else {
                System.out.printf("Invalid command. Please try again!\n");
                System.out.printf("""
                        Choose:
                        *********************
                             [R]ock
                             [P]aper
                             [S]cissors
                        *********************
                        """);
                move = scanner.nextLine();
            }
        }
        return move;
    }
}


