package sk.shepherd.gamestudio.snake.console;

import sk.shepherd.gamestudio.snake.core.Board;
import sk.shepherd.gamestudio.snake.core.GameState;

public class ConsoleUI {
    private Board board;

    public ConsoleUI(Board board) {
        this.board = board;
    }

    public void play() {
        if (board.getGameState() == GameState.PLAYING) {
            printBoard();
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.getRowCount(); i++) {
            for (int j = 0; j < board.getColumnCount(); j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
