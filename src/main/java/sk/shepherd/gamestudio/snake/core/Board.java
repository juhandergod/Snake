package sk.shepherd.gamestudio.snake.core;

public class Board {
    private int rowCount;
    private int columnCount;
    private GameState gameState;

    public Board(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        gameState = GameState.PLAYING;

    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
}
