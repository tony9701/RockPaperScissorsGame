public class GameLogic {
    void gameLogic(String playerMove, String computerMove) {
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

        //Printing the winner!
        if (isPlayerWin) {
            System.out.printf("Player is winning!\n");
        } else if (isComputerWin) {
            System.out.printf("Computer is winning!\n");
        } else {
            System.out.printf("It's a draw!\n");
        }
    }
}
