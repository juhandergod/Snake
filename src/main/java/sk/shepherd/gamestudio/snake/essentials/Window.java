package sk.shepherd.gamestudio.snake.essentials;

import javax.swing.JFrame;

public class Window extends JFrame implements Runnable {

    private int width;
    private int height;
    private String gameTitle;

    public Window(int width, int height, String gameTitle) {
        setSize(width, height);
        setTitle(gameTitle);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {

    }
}
