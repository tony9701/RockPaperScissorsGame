import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Player Toni = new Player();
        Computer PC = new Computer();
        GameLogic newGame = new GameLogic();
        for (int i = 0; i < 5; i++) {

            newGame.gameLogic(Toni.playerMoves(), PC.ComputerMove());
        }
    }
}
