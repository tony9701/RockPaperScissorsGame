public class GameLogic {
    int playerWins;
    int computerWins;
    public void gameLogic(String playerMove, String computerMove) {
        //Flags
        boolean isRock = false;
        boolean isPaper = false;
        boolean isScissors = false;
        boolean isPlayerWin = false;
        boolean isComputerWin = false;

        //Checking player move and changing its flag to TRUE;
        switch (playerMove) {
            case "Rock":
                isRock = true;
                break;
            case "Paper":
                isPaper = true;
                break;
            case "Scissors":
                isScissors = true;
                break;
        }

        //Checking computer move and also checking the player move (boolean flag)
        switch (computerMove) {
            case "Rock":

                if (isPaper) {
                    isPlayerWin = true;
                } else if (isScissors) {
                    isComputerWin = true;
                }
                break;
            case "Paper":
                if (isRock) {
                    isComputerWin = true;
                } else if (isScissors) {
                    isPlayerWin = true;
                }
                break;
            case "Scissors":
                if (isRock) {
                    isPlayerWin = true;
                } else if (isPaper) {
                    isComputerWin = true;
                }
                break;
        }

        //Printing the winner and calling the counter method!
        if (isPlayerWin) {
            System.out.printf("Player is winning!\n");
            counter(1);
        } else if (isComputerWin) {
            System.out.printf("Computer is winning!\n");
            counter(2);
        } else {
            System.out.printf("It's a draw!\n---------------------\n");
        }
    }

    public int counter(int countIndex) {


        if (countIndex == 1) {
            playerWins++;
            System.out.printf("Player wins: %d\n---------------------\n", playerWins);
        } else if (countIndex == 2) {
            computerWins++;
            System.out.printf("Computer wins: %d\n---------------------\n", computerWins);
        }

        if (playerWins == 3) {
            System.out.printf("\nYou are the CHAMPION! ^_^\n");
            return 1;
        } else if (computerWins == 3) {
            System.out.printf("\nThe computer is the CHAMPION! :(\n");
            return 2;
        }
        return 0;
    }
}
