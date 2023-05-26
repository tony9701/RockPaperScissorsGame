import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) throws InterruptedException {
        Player Toni = new Player();
        Computer PC = new Computer();
        GameLogic newGame = new GameLogic();

        while (true) {

            newGame.gameLogic(Toni.playerMoves(), PC.ComputerMove());
            if (newGame.computerWins == 3) {
                break;
            } else if (newGame.playerWins == 3) {
                break;
            }
            Thread.sleep(900);
        }
    }
}
