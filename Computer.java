import java.util.Random;

public class Computer {
    private String computerChosenMove;
    public String ComputerMove() {
        //Choosing random number from 1 to 3 (1 for Rock, 2 for Paper and 3 for Scissors)
        Random computerMove = new Random();
        int computer = computerMove.nextInt(1, 4);

        if (computer == 1) {
            computerChosenMove = "Rock";
        } else if (computer == 2) {
            computerChosenMove = "Paper";
        } else if (computer == 3) {
            computerChosenMove = "Scissors";
        }

        return computerChosenMove;
    }
}
