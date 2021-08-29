package sk.shepherd.gamestudio;

import sk.shepherd.gamestudio.snake.Constants;
//import sk.shepherd.gamestudio.snake.console.ConsoleUI;
//import sk.shepherd.gamestudio.snake.core.Board;
import sk.shepherd.gamestudio.snake.essentials.Window;

public class Main {
    public static void main(String[] args) {
//        Board board = new Board(10,10);
//        ConsoleUI consoleUI = new ConsoleUI(board);
//        consoleUI.play();
        Window window = new Window(Constants.SC_WIDTH,Constants.SC_HEIGHT,Constants.GAME_NAME);

        Thread thread = new Thread(window);
        thread.start();
    }
}
