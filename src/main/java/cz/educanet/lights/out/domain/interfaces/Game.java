package cz.educanet.lights.out.domain.interfaces;

import java.util.Random;

public class Game implements ILightsOut {
    private boolean field[][] = new boolean[5][5];
    private int isGameOverCount;
    private int moveCount;

    public Game() {
        Random rand = new Random();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = rand.nextBoolean();
            }
        }
    }

    @Override
    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public boolean isGameOver() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (!field[i][j]) {
                    isGameOverCount++;
                }
            }
        }
        return isGameOverCount == 25;
    }

    @Override
    public boolean[][] getGrid() {
        return field;
    }

    @Override
    public void makeMove(int x, int y) {
        moveCount++;
        if (!getGrid()[x][y])
            getGrid()[x][y] = true;
        else
            getGrid()[x][y] = false;

        if (x + 1 <= 4)
            getGrid()[x + 1][y] = !getGrid()[x + 1][y];
        if (y + 1 <= 4)
            getGrid()[x][y + 1] = !getGrid()[x][y + 1];
        if (x - 1 >= 0)
            getGrid()[x - 1][y] = !getGrid()[x - 1][y];
        if (y - 1 >= 0)
            getGrid()[x][y - 1] = !getGrid()[x][y - 1];
    }
}
